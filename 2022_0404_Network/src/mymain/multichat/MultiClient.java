package mymain.multichat;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MultiClient extends JFrame {

	// �����â
	JTextArea displayTextField;
	// �޽���â
	JTextField messageField;
	// �����ڸ��
	JList<String> userList;

	Font font = new Font("", Font.BOLD, 16);

	// �����ư
	JButton connectButton;
	// ������¸� Ȯ���ϴ� ��ư
	boolean connectCheck = false;
	
	// ��Ʈ��ũ
	Socket client;
	
	BufferedReader buffReader;
	String nickname = "�ʹ��";
	

	public MultiClient() {

		super("��Ƽ����");

		// ���â
		initDisplay();
		// �Է�â
		initMessage();
		// �����ڸ��
		initUserList();

		// ��ġ ���ϱ�
		this.setLocation(200, 100);
		// ũ�� ���ϱ�
		pack();
		// �����ֱ�
		this.setVisible(true);
		// ����
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	private void initMessage() {
		JPanel panel = new JPanel(new BorderLayout());

		messageField = new JTextField();
		connectButton = new JButton("����");
		connectButton.setPreferredSize(new Dimension(120, 0));

		panel.add(messageField, "Center");
		panel.add(connectButton, "East");

		this.add(panel, "South");

		connectButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// callback�޼���
				onConnectButton();
			}
		});

	}

	protected void onConnectButton() {
		connectCheck = !connectCheck;

		if (connectCheck) { // ����
			try {
				client = new Socket("localhost", 8000);
				//ù��° ���� �޽��� ����
				String sentMessage = String.format("IN#%s\n", nickname);
				client.getOutputStream().write(sentMessage.getBytes());
				//�޽��� ���Ŵ��
				readMessage();
				
			} catch (IOException e) {
				JOptionPane.showMessageDialog(this, "�������");
				connectCheck = false;
				return;
				
			}
		} else { // ����
			
			try {
				//������ �ݴ´�.
				client.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		// ��ư�� ĸ�� ����
		connectButton.setText(connectCheck ? "����" : "����");
	}

	private void readMessage() {
		InputStream input;
		try {
			input = client.getInputStream();
			InputStreamReader inputReader = new InputStreamReader(input);
			buffReader = new BufferedReader(inputReader);
			
			//������ ���Ŵ��� ������ ����
			new Thread() {
				public void run() {
					while(true) {
						try {
							String readData = buffReader.readLine();
							if(readData==null) {
								break;
								// ����� �������� ������ ���� �ڵ� ����
							}
							
						} catch (IOException e) {
							break;
						}
					}
					//���� ������ �����쿡 ���� �ڵ�
					
				}
			}.start();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	public void displayMessage(String message) { // ä�� ���
		displayTextField.append(message);
		displayTextField.append("\r\n");
		// ����� ĳ���������� �ǳ����� �����ϱ�
		int position = displayTextField.getDocument().getLength();
		displayTextField.setCaretPosition(position);
	}

	private void initDisplay() { // ä�� ������ ���̴� â
		displayTextField = new JTextArea();
		displayTextField.setFont(font);
		JScrollPane scrollPane = new JScrollPane(displayTextField);
		scrollPane.setPreferredSize(new Dimension(400, 400));
		this.add(scrollPane, "Center");

		// �б�����
		displayTextField.setEditable(false);

	}

	private void initUserList() {
		userList = new JList<String>();
		JScrollPane scrollPane = new JScrollPane(userList);
		scrollPane.setPreferredSize(new Dimension(120, 0));
		this.add(scrollPane, "East");
	}

	public static void main(String[] args) {
		new MultiClient();

	}
	
	

}
