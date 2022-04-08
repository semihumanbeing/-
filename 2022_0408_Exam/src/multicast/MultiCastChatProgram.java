package multicast;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MultiCastChatProgram extends JFrame {

	// �������������ϱ�----------

	// ��ȭ��
	String nickname = "�ʹ��";

	// ���â
	JTextArea textArea;
	// �Է�â
	JTextField messageField;

	// �׷�� �޺��ڽ�
	JComboBox<String> groupNameComboBox;
	// �޺��ڽ��� ���� ����Ʈ
	String[] groupNameArray = { "�ڹٰ�����", "�����������󰨻��", "�����Ͱ�����", "���Ӱ�����" };
	String[] groupIPArray = { "224.0.0.1", "224.0.0.2", "224.0.0.3", "224.0.0.4" };

	// �׷��� ��¿� J����Ʈ
	JList<String> jGroupList = new JList<String>();
	List<String> nameList = new ArrayList<>();
	// IP�ּ� ����� ����Ʈ
	List<String> ipList = new ArrayList<>();

	// �׷��� �����Ǹ� �����ϴ� �ؽø�
	Map<String, String> groupMap = new HashMap<String, String>() {
		{
			put("�ڹٰ�����", "224.0.0.1");
			put("�����������󰨻��", "224.0.0.2");
			put("�����Ͱ�����", "224.0.0.3");
			put("���Ӱ�����", "224.0.0.4");
		}
	};

	// ��Ƽĳ��Ʈ ���� ����
	MulticastSocket multiCastSocket;

	// ��Ʈ
	Font font = new Font("", Font.BOLD, 15);

	public MultiCastChatProgram() {

		super("ICT��");

		// ���â �ʱ�ȭ / ����� â�� ������ �κ�
		initDisplay();
		// �Է�â �ʱ�ȭ / �Է�â�� ������ �κ�
		initInput();
		// �׷���(����) �ʱ�ȭ / �����ڸ���� �����ºκ�
		initGroupList();
		// Ű �̺�Ʈ �ʱ�ȭ / / �Ű�� �������� ���ε尡 ������ ���� �κ�
		initKeyEvent();
		// ���� �ʱ�ȭ / ��Ʈ��ũ ���Ͽ� ���� �κ�
		initSocket();

		// ��ġ ���ϱ�
		this.setLocation(200, 100);
		// ũ�� ���ϱ�
		pack();
		// �����ֱ�
		this.setVisible(true);
		// ����
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	private void initDisplay() {
		textArea = new JTextArea();
		JScrollPane jScrollPane = new JScrollPane(textArea);
		jScrollPane.setPreferredSize(new Dimension(400, 300));
		this.add(jScrollPane, "Center");

		textArea.setEditable(false);
		textArea.setFont(font);

	}

	private void initInput() {
		JPanel panel = new JPanel(new GridLayout(3, 1));
		// 1��°��: �޺��ڽ�
		JPanel panel1 = new JPanel(new GridLayout(1, 1));
		// �޺��ڽ��� ��̰��� ����ִ´�
		groupNameComboBox = new JComboBox<String>(groupNameArray);
		// ��Ŀ� ���õ� �̸��� ���� �������ּҸ� �����Ѵ�.
		/*
		 * updateIPAddress(); // groupName�޺��ڽ��� �׼Ǹ����ʰ� ����ϰ� �ִٰ� �μ����� ���õɶ����� // ������ �ּҸ�
		 * �����ϴ� �޼��带 �۵���Ų��. groupNameComboBox.addActionListener(new ActionListener() {
		 * 
		 * @Override public void actionPerformed(ActionEvent e) { updateIPAddress(); }
		 * });
		 */
		panel1.add(groupNameComboBox);

		// 2��°��: ����,Ż���ư
		JPanel panel2 = new JPanel(new GridLayout(1, 3));
		JButton joinButton = new JButton("����");
		JButton leaveButton = new JButton("����");
		JButton sendAll = new JButton("��ü����/alt");
		panel2.add(joinButton);
		panel2.add(leaveButton);
		panel2.add(sendAll);

		joinButton.addActionListener(e -> {
			onJoinButton();
		});

		leaveButton.addActionListener(e -> {
			onLeaveButton();
		});

		sendAll.addActionListener(e -> {
			onSendAllButton();
		});

		// 3��°��: �޽���â
		messageField = new JTextField();
		messageField.setFont(font);

		// �гο� ���� ����ְ� ��ġ ���ϱ�
		panel.add(panel1);
		panel.add(panel2);
		panel.add(messageField);
		this.add(panel, "South");

	}

	private void onSendAllButton() {
		// �Է� �޽��� �о����, ���� �����ϱ�
		String message = messageField.getText().trim();

		if (message.isEmpty()) {
			JOptionPane.showMessageDialog(this, "�޽����� �Է��ϼ���");
			messageField.setText(""); // �� ����
			return;
		}

		// ��Ʈ��ũ�� ����
		String ip = "255.255.255.255";
		// data�� �ּ�(InetAddress)�� ��� DatagramPacket���� ������
		try {
			InetAddress ia = InetAddress.getByName(ip);
			// ���۵����� ����: nickname#message
			String sendData = String.format("%s#%s", nickname, message);
			byte[] sentBytes = sendData.getBytes();
			DatagramPacket dp = new DatagramPacket(sentBytes, sentBytes.length, ia, 5000);

			// ������ ���ؼ� ����
			multiCastSocket.send(dp);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// �Է� �� �޽��� �����
		messageField.setText("");

		// ĳ�������� �����ϱ�
		int position = messageField.getDocument().getLength();
		messageField.setCaretPosition(position);

	}

	private void onJoinButton() {
		String groupName = (String) groupNameComboBox.getSelectedItem();
		String ip = groupMap.get(groupName);

		if (nameList.contains(groupName)) {
			JOptionPane.showMessageDialog(this, "�̹� ���Ե� �ּ��Դϴ�");
			return;
		}

		try {
			// ���Լ�����
			InetAddress iNetAddress = InetAddress.getByName(ip);
			multiCastSocket.joinGroup(iNetAddress);

			nameList.add((String) groupNameComboBox.getSelectedItem());
			updateGroupList();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private void onLeaveButton() {
		try {
			// �׷츮��Ʈ���� ���õȰ�
			String groupName = jGroupList.getSelectedValue();
			// Ż���ϱ�
			if (groupName == null) {
				JOptionPane.showMessageDialog(this, "������ �׷��ּҸ� �����ϼ���");
				return;
			}

			int result = JOptionPane.showConfirmDialog(this, "�����Ͻðڽ��ϱ�?", "�����ϱ�", JOptionPane.YES_NO_OPTION);
			if (result != 0)
				return;
			String ip = groupMap.get(groupName);
			// ��Ʈ��ũ�� ip ã��
			InetAddress ia = InetAddress.getByName(ip);
			// ���Ե� �ּҸ� arrayList���� �����Ѵ�.
			nameList.remove(groupName);
			multiCastSocket.leaveGroup(ia);
			// ������JListâ ����
			updateGroupList();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private void updateGroupList() {
		String[] groupArray = new String[nameList.size()];
		nameList.toArray(groupArray);
		jGroupList.setListData(groupArray);

	}

	private void initGroupList() {
		jGroupList.setFont(font);
		JScrollPane scrollPane = new JScrollPane(jGroupList);
		scrollPane.setPreferredSize(new Dimension(150, 0));
		this.add(scrollPane, "East");

		// JList�� ������ �ֱ�
		String[] ipArray = { "" };
		jGroupList.setListData(ipArray);

	}

	private void initKeyEvent() {
		messageField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int key = e.getKeyCode();
				if (key == KeyEvent.VK_ENTER) {
					sendMessage();
				} else if (key == KeyEvent.VK_ALT) {
					onSendAllButton();
				}
			}
		});

	}

	protected void sendMessage() {
		// �Է� �޽��� �о����, ���� �����ϱ�
		String message = messageField.getText().trim();
		// ����ִ��� Ȯ���ϱ�
		if (nameList.isEmpty()) {
			JOptionPane.showMessageDialog(this, "���� �� �޽����� ���� �� �ֽ��ϴ�");
			messageField.setText(""); // �� ����
			return;
		}
		if (message.isEmpty()) {
			JOptionPane.showMessageDialog(this, "�޽����� �Է��ϼ���");
			messageField.setText(""); // �� ����
			return;
		}

		// ��Ʈ��ũ�� ����
		String ip = groupMap.get(groupNameComboBox.getSelectedItem().toString());
		// data�� �ּ�(InetAddress)�� ��� DatagramPacket���� ������
		try {
			InetAddress ia = InetAddress.getByName(ip);
			// ���۵����� ����: nickname#message
			String sendData = String.format("%s#%s", nickname, message);
			byte[] sentBytes = sendData.getBytes();
			DatagramPacket dp = new DatagramPacket(sentBytes, sentBytes.length, ia, 5000);

			// ������ ���ؼ� ����
			multiCastSocket.send(dp);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// �Է� �� �޽��� �����
		messageField.setText("");

		// ĳ�������� �����ϱ�
		int position = messageField.getDocument().getLength();
		messageField.setCaretPosition(position);

	}

	private void initSocket() {

		// ��Ƽĳ��Ʈ������ ����� ������ ����
		try {
			multiCastSocket = new MulticastSocket(5000);
			// �ش� ��Ʈ��ũ�� �����͸� �����ϴ� ������ �����ϱ�
			new Thread() {
				public void run() {
					while (true) {
						receiveMessage();
					}
				};
			}.start();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	protected void receiveMessage() {
		try {
			// datagramPacket�� �� �����͸� ���� ���� �����ϱ�
			byte[] readBuffer = new byte[512];
			// �����ϱ�
			DatagramPacket packet = new DatagramPacket(readBuffer, readBuffer.length);
			// ������ ���ؼ� ����
			multiCastSocket.receive(packet);
			// ��Ŷ�� �����͸� String ��ü�� ��ȯ�ϱ�
			String readData = new String(packet.getData()).trim();
			// #�� �������� ��̷� �и��ϱ�
			String[] readDataArray = readData.split("#");
			// ��¸޽����� �����ϱ�
			String displayMessage = String.format("%s��: %s\r\n", readDataArray[0], readDataArray[1]);
			textArea.append(displayMessage);

			// ĳ�� ������ �����ϱ�
			int position = textArea.getDocument().getLength();
			textArea.setCaretPosition(position);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new MultiCastChatProgram();

	}

}
