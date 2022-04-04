package mymain.multicast;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MultiCastChat extends JFrame {
	
	//���â
	JTextArea textArea;
	//�Է�â
	JTextField messageField;
	//Ű �̺�Ʈ �ʱ�ȭ
	
	//�ּ�â
	JTextField addressField;
	//��ȭ��
	String nickName = "�ʹ��";
	
	Font font = new Font("", Font.BOLD, 16);
	
	public MultiCastChat() {

		super("��Ƽĳ��Ʈ ����");
		
		// ���â �ʱ�ȭ
		initDisplay();
		
		// �Է�â �ʱ�ȭ
		initInput();
		
		initKeyEvent();
		

		//��ġ ���ϱ�
		this.setLocation(200, 100);
		//ũ�� ���ϱ�
		pack();
		//�����ֱ�
		this.setVisible(true);
		//����
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	private void initKeyEvent() {
		messageField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int key = e.getKeyCode();
				if(key == KeyEvent.VK_ENTER) {
					sendMessage();
				}
			}
		});
		
	}

	protected void sendMessage() {
		//�Է� �޽��� �о����, ���� �����ϱ�
		String message = messageField.getText().trim();
		//����ִ��� Ȯ���ϱ�
		if(message.isEmpty()) {
			JOptionPane.showMessageDialog(this, "�޽����� �Է��ϼ���");
			messageField.setText(""); // �� ����
			return;
		}
		
		//���
		String displayMessage = String.format("%s ��: %s\r\n", nickName, message);
		textArea.append(displayMessage);
		messageField.setText("");
		
		//��ü ������ ���� ���ϱ�
		int position = messageField.getDocument().getLength();
		messageField.setCaretPosition(position);
		
	}

	private void initInput() {
		JPanel panel = new JPanel(new GridLayout(3,1));
		
		// 1��° ��: �ּ�
		addressField = new JTextField("255,255,255,255"); // global broadcast �ּ�
		addressField.setFont(font);
		// 2��° ��: ����, Ż�� ��ư
		JPanel panel1 = new JPanel(new GridLayout(1,2));
		JButton joinButton = new JButton("����");
		JButton deleteAccountButton = new JButton("Ż��");
		
		panel1.add(joinButton);
		panel1.add(deleteAccountButton);
		joinButton.setFont(font);
		deleteAccountButton.setFont(font);
		
		// 3��° ��: �޽���â
		messageField = new JTextField();
		messageField.setFont(font);
		
		panel.add(addressField);
		panel.add(panel1);
		panel.add(messageField);
		
		this.add(panel, "South");
	}

	private void initDisplay() {
		textArea = new JTextArea();
		JScrollPane jsp = new JScrollPane(textArea);
		jsp.setPreferredSize(new Dimension(400,400));
		this.add(jsp,"Center");
		
		// textArea �б��������� ����� (����x)
		textArea.setEditable(false);
		textArea.setFont(font);
	}

	public static void main(String[] args) {
		new MultiCastChat();

	}

}
