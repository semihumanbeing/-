package mymain.multichat;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MultiServer extends JFrame {

	// �����â
	JTextArea displayTextField;
	// �����ڼ�
	JTextField userCountTextField;
	// �����ڸ��
	JList<String> userJList;

	Font font = new Font("", Font.BOLD, 16);
	
	
	// ����
	ServerSocket server;

	// ������ ����ȭ ������ü
	Object syncObject = new Object();
	
	// �ڼ����� ������ ArrayList (initServer)
	List<ReadThread> socketList = new ArrayList<ReadThread>();

	// ����������ü
	List<String> userList = new ArrayList<String>();

	public MultiServer() {

		super("��Ƽ����");
		// ���â
		initDisplay();
		// �����ڼ�
		initUserCount();
		// �����ڸ��
		initUserList();
		// �����ʱ�ȭ
		initServer();

		// ��ġ ���ϱ�
		this.setLocation(200, 100);
		// ũ�� ���ϱ�
		pack();
		// �����ֱ�
		this.setVisible(true);
		// ����
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	private void initServer() {
		try {
			server = new ServerSocket(8000);
			displayMessage("�����");
			// ���� ������ ���� - ���� ��� �뵵
			// �͸�Ŭ����
			new Thread() {
				public void run() {
					while (true) {
						try {
							Socket child = server.accept();
							
							synchronized (syncObject) {
							// ���Ӱ���
							ReadThread readThread = new ReadThread(child);
							readThread.start();
							
							// �ڼ����� ������ ������ ��ü�� arraylist�� �߰��ϱ�
							socketList.add(readThread);
							
							// �����ڼ� ���
							displayUserCount();
							}
								

						} catch (IOException e) {
							e.printStackTrace();
						}
					} // while
				}// run
			}.start();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	protected void displayUserCount() {
		userCountTextField.setText(socketList.size() + "");

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

	private void initUserCount() {
		JPanel panel = new JPanel(new GridLayout(1, 3));

		JLabel userLabel = new JLabel("�����ڼ�", JLabel.RIGHT);
		userLabel.setFont(font);

		userCountTextField = new JTextField("0");
		userCountTextField.setFont(font);
		userCountTextField.setHorizontalAlignment(JTextField.CENTER);

		JLabel userCountLabel = new JLabel("��");
		userCountLabel.setFont(font);

		panel.add(userLabel);
		panel.add(userCountTextField);
		panel.add(userCountLabel);

		this.add(panel, "South");
	}

	private void initUserList() {
		userJList = new JList<String>();
		JScrollPane scrollPane = new JScrollPane(userJList);
		scrollPane.setPreferredSize(new Dimension(120, 0));
		this.add(scrollPane, "East");
	}

	public static void main(String[] args) {
		new MultiServer();

	}

	// MultiServer ����Ŭ���� ���𿵿�----------------------------------------------
	class ReadThread extends Thread {
		Socket child;
		BufferedReader buffReader;

		public ReadThread(Socket child) {
			super();
			this.child = child;
			try {
				InputStream input = child.getInputStream();
				InputStreamReader inputReader = new InputStreamReader(input);
				buffReader = new BufferedReader(inputReader);

				OutputStream output = child.getOutputStream();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		// child ������ ���Ŵ��뵵 �̿�
		public void run() {
			while (true) {
				// 1�ٴ����� ����
				try {
					String readData = buffReader.readLine();
					if (readData == null) {
						// System.out.println("��������");
						break; // ��������� close

					}

					// ���� ����͸�...
					displayMessage(readData);

					// �޽��� �з�
					String[] messageArray = readData.split("#");
					
					if (messageArray[0].equals("IN")) { // �����϶�
						synchronized (syncObject) {
							
						userList.add(messageArray[1]);
						displayUserList();
						sendMessageToAll(readData + "\n");
						}
						
					} else {
						// �޽����� ���ӵ� ��� ����ڿ��� ����
						synchronized (syncObject) {
							
						sendMessageToAll(readData + "\n");
						}
						/*
						 * // ���� ������ ����� ��� ����ڿ��� ���� sendUserListToAll();
						 */
					}

				} catch (IOException e) {
					// System.out.println("����������");
					break; // ����������� (���α׷� ���� �����)
				}
			}
			
			synchronized (syncObject) {
				
			// ���� ����� ���� �����带 socketList�κ��� �����ؾ��Ѵ�.
			int index = socketList.indexOf(this);
			//������ ������� �г��� ���ϱ�
			String outMember = userList.get(index);
			socketList.remove(index);
			displayUserCount(); // �ο��� �����������
			
			userList.remove(index);
			displayUserList();
			
			//�������� ����
			String message = String.format("OUT#%s\n", outMember);
			sendMessageToAll(message);
			
			//���� ������ ����� ��� ����ڿ��� ����
			sendUserListToAll();
			
			}
		}
	}
	// ------------------------------------------------------------------------

	public void displayUserList() {
		String[] userArray = new String[userList.size()];
		userList.toArray(userArray);
		userJList.setListData(userArray);
	}

	public void sendUserListToAll() {
		StringBuffer stringBuffer = new StringBuffer("LIST");
		for(String nickname : userList) {
			stringBuffer.append("#");
			stringBuffer.append(nickname);
			
		}
		sendMessageToAll(stringBuffer.toString()+"\n");
	}

	public void sendMessageToAll(String message) {
		for(int i =0; i<socketList.size();i++) {
			try {
				ReadThread readThread = socketList.get(i);
				readThread.child.getOutputStream().write(message.getBytes());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
