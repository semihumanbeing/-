package mymain;

import java.awt.event.WindowListener;

import javax.swing.JFrame;

public class BaseWindow extends JFrame {

	public BaseWindow() {
		super("������ �̺�Ʈ ����");
		
		setLocation(200, 100);
		setSize(400,400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		WindowListener listener = new MyWindowEventListener();
		this.addWindowListener(listener);
	}

	public static void main(String[] args) {
		new BaseWindow();

	}

}
