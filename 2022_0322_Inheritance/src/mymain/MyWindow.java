package mymain;

//import java.awt.Frame;
//AWT = Abstract Window Toolkit
import javax.swing.JFrame;
// Swing 

public class MyWindow extends JFrame {

	public MyWindow() {
		// constructor �޼��� - �ʱ�ȭ ����
		
		// Ÿ��Ʋ
		super("My window");
		
		super.setTitle("�ȳ��ϼ���");
		// ��ġ
		super.setLocation(100, 100);
		// ũ��
		super.setSize(400, 300);
		// �����ֱ�
		super.setVisible(true);
		// ������
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new MyWindow();

	}

}
