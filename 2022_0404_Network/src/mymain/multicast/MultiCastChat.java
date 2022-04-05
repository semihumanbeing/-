package mymain.multicast;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MultiCastChat extends JFrame {

	// ���â
	JTextArea textArea;
	// �Է�â
	JTextField messageField;
	// Ű �̺�Ʈ �ʱ�ȭ

	// �ּ�â
	JTextField addressField;
	// �׷��
	JComboBox<String> groupNameField;
	
	// ��ȭ��
	String nickName = "�ʹ��";

	// DatagramSoket <- uni-cast / broadcast
	// ��MulticastSocket ���� <- multicast
	MulticastSocket multiCastSocket;

	Font font = new Font("", Font.BOLD, 16);

	// multicast �׷쿡 ���Ե� �ּ�
	List<String> groupList = new ArrayList<String>();
	// ��� ��¿� ������Ʈ
	JList<String> jListGroup = new JList<String>();
	
	String[] groupNameArray =     {"�ѹ���",   "�λ��",   "�渮��",   "������"   ,"��ȹ��",   "��ü����",};
	String [] groupIPArray = {"224.0.0.1","224.0.0.2","224.0.0.3","224.0.0.4","224.0.0.5","255.255.255.255",};

	public MultiCastChat() {

		super("��Ƽĳ��Ʈ ����");

		// ���â �ʱ�ȭ
		initDisplay();

		// �Է�â �ʱ�ȭ
		initInput();

		// �׷���â �ʱ�ȭ
		initGroupList();

		// Ű�̺�Ʈ �ʱ�ȭ
		initKeyEvent();

		// ���� �ʱ�ȭ
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

	private void initGroupList() {
		jListGroup.setFont(font);
		JScrollPane scrollPane = new JScrollPane(jListGroup);
		scrollPane.setPreferredSize(new Dimension(150, 0));
		this.add(scrollPane, "East");

		// JList �� ������ �ֱ�
		String[] ipArray = { "" };
		jListGroup.setListData(ipArray);

	}

	private void initSocket() {
		try {
			multiCastSocket = new MulticastSocket(5000);

			// ������ ������ ����
			new Thread() {
				public void run() {
					// ������ ����
					while (true) {
						readMessage();
					}
				};
			}.start();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	protected void readMessage() {
		try {
			byte[] readBuffer = new byte[512];
			// �о�� �����͸� ���� ���۸� ����
			DatagramPacket dp = new DatagramPacket(readBuffer, readBuffer.length);
			// ������ ���ؼ� ����
			multiCastSocket.receive(dp); // �޽����� �ö����� ���
			// ������ �ּ�
			InetAddress youria = dp.getAddress();
			// �о�� ������ �����ͼ� String ��ü�� ����
			String readData = new String(dp.getData()).trim();
			// #�� �������� �и�
			String[] readDataArray = readData.split("#");
			// ��¸޽��� ����
			String displayMessage = String.format("%s��: %s\r\n", readDataArray[0], readDataArray[1]);
			textArea.append(displayMessage);
			int position = textArea.getDocument().getLength();
			textArea.setCaretPosition(position);
			System.out.printf("[%s]%s", youria.getHostAddress(), displayMessage);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private void initKeyEvent() {
		messageField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int key = e.getKeyCode();
				if (key == KeyEvent.VK_ENTER) {
					sendMessage();
				}
			}
		});

	}

	protected void sendMessage() {
		// �Է� �޽��� �о����, ���� �����ϱ�
		String message = messageField.getText().trim();
		// ����ִ��� Ȯ���ϱ�
		if (message.isEmpty()) {
			JOptionPane.showMessageDialog(this, "�޽����� �Է��ϼ���");
			messageField.setText(""); // �� ����
			return;
		}

		// ��Ʈ��ũ�� ����
		String ip = addressField.getText().trim();
		if (ip.isEmpty()) {
			JOptionPane.showMessageDialog(this, "�ּҸ� �Է��ϼ���");
			addressField.setText(""); // �� ����
			return;
		}

		// data�� �ּ�(InetAddress)�� ��� DatagramPacket���� ������
		try {
			InetAddress ia = InetAddress.getByName(ip);
			// ���۵����� ����: nickname#message
			String sendData = String.format("%s#%s", nickName, message);
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

		// ��ü ������ ���� ���ϱ�
		int position = messageField.getDocument().getLength();
		messageField.setCaretPosition(position);

	}

	private void initInput() {
		JPanel panel = new JPanel(new GridLayout(3, 1));

		// 1��° ��: �ּ�
		// addressField = new JTextField("255.255.255.255"); // global broadcast �ּ�
		groupNameField = new JComboBox<String>(groupNameArray);
		
		JPanel panel0 = new JPanel(new GridLayout(1,2));
		addressField = new JTextField("224.0.0.1"); // multicast �ּ�
		addressField.setFont(font);
		JComboBox<String> comboBox = new JComboBox<String>(groupNameArray);
		
		panel0.add(comboBox);
		panel0.add(addressField);
		
		
		// 2��° ��: ����, Ż�� ��ư
		JPanel panel1 = new JPanel(new GridLayout(1, 2));
		JButton joinButton = new JButton("����");
		JButton deleteAccountButton = new JButton("Ż��");

		panel1.add(joinButton);
		panel1.add(deleteAccountButton);
		joinButton.setFont(font);
		deleteAccountButton.setFont(font);

		// 3��° ��: �޽���â
		messageField = new JTextField();
		messageField.setFont(font);

		panel.add(panel0);
		panel.add(panel1);
		panel.add(messageField);

		this.add(panel, "South");

		// ��ư�̺�Ʈ ����ϱ�
		joinButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				onJoinButton(); // on�� ���� �޼���� �ַ� callback�޼����̴�. (�̺�Ʈ���� �ڵ�ȣ��)

			}
		});
		deleteAccountButton.addActionListener(e -> {
			onDeleteAccountButton();
		});
	}

	@SuppressWarnings("deprecation")
	protected void onJoinButton() {
		// System.out.println("�����ϱ�");
		// 1. �ּ� �о����
		String ip = addressField.getText().trim();
		if (ip.isEmpty()) {
			JOptionPane.showMessageDialog(this, "������ �ּҸ� �Է��ϼ���");
			addressField.setText("224.0.0.1");
			return;
		}

		// ���Կ��� Ȯ���ϱ�
		if (groupList.contains(ip)) {
			JOptionPane.showMessageDialog(this, "�̹� ���Ե� �ּ��Դϴ�.");
			return;
		}

		// �����ϱ�
		try {
			// ��Ʈ��ũ�� ���Լ���
			InetAddress ia = InetAddress.getByName(ip);
			multiCastSocket.joinGroup(ia);
			// ���Ե� �ּҸ� arrayList�� �ִ´�.
			groupList.add(ip);
			// ������JListâ ����
			updateGroupList();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private void updateGroupList() {
		// ArrayList -> Array�� ����
		String[] groupArray = new String[groupList.size()];
		groupList.toArray(groupArray);
		jListGroup.setListData(groupArray);

	}

	protected void onDeleteAccountButton() {
		// System.out.println("Ż���ϱ�");
		// 1. �ּ� �о����
		String ip = jListGroup.getSelectedValue();

		if (ip == null) {
			JOptionPane.showMessageDialog(this, "Ż���� �׷��ּҸ� �����ϼ���");
			return;
		}

		int result = JOptionPane.showConfirmDialog(this, "Ż���Ͻðڽ��ϱ�?", "�׷�Ż��", JOptionPane.YES_NO_OPTION);
		if (result != 0)
			return;

		// Ż���ϱ�
		try {
			// ��Ʈ��ũ�� ���Լ���
			InetAddress ia = InetAddress.getByName(ip);
			// ���Ե� �ּҸ� arrayList���� �����Ѵ�.
			groupList.remove(ip);
			multiCastSocket.leaveGroup(ia);
			// ������JListâ ����
			updateGroupList();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private void initDisplay() {
		textArea = new JTextArea();
		JScrollPane jsp = new JScrollPane(textArea);
		jsp.setPreferredSize(new Dimension(400, 400));
		this.add(jsp, "Center");

		// textArea �б��������� ����� (����x)
		textArea.setEditable(false);
		textArea.setFont(font);
	}

	public static void main(String[] args) {
		new MultiCastChat();

	}

}
