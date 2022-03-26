package mymain;

import java.awt.Dimension;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class KeyEventTest extends JFrame {
	int screenWidth, screenHeight;
	int windowWidth, windowHeight;

	public KeyEventTest() {

		super("key event ����");

		// Ű �̺�Ʈ �ʱ�ȭ
		// init_KeyEvent();

		init_KeyEvent2();

		// ---------------------------------------------------------
		// ��ġ ���ϱ�
		this.setLocation(200, 100);
		// ũ�����ϱ�
		windowWidth = 400;
		windowHeight = 300;
		this.setSize(windowWidth, windowHeight);

		this.setVisible(true);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	private void init_KeyEvent2() {
		/*
		 * class myKeyAdapter extends KeyAdapter{
		 * 
		 * @Override public void keyPressed(KeyEvent e) { // TODO Auto-generated method
		 * stub super.keyPressed(e); }
		 * 
		 * }
		 */

		// �͸� ��ü ����
		// listener �� ��ü �������̽��� �� ����ؾ� ������
		// adapter�� �߻�Ŭ�����̱� ������ �ʿ��� ������ override�ؼ� ����ȴ�.
		KeyAdapter ka = new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent e) {
				// super.keyPressed(e);
				// ���� Ű ���� ������
				int key = e.getKeyCode();

				// ���������� ��ġ���ϱ�
				Point point = KeyEventTest.this.getLocation();
				System.out.printf("%d %d\n", point.x, point.y);

				// ȭ���ػ� ���ϱ�
				Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
				screenWidth = d.width;
				screenHeight = d.height;

				int speed = 30;

				if (key == KeyEvent.VK_LEFT) {
					point.x = point.x - speed;
					if (point.x <= -windowWidth) {
						point.x = screenWidth;
					}

				} else if (key == KeyEvent.VK_RIGHT) {
					point.x = point.x + speed;
					if (point.x >= screenWidth) {
						point.x = point.x - screenWidth - windowWidth;
					}

				} else if (key == KeyEvent.VK_UP) {
					point.y = point.y - speed;
					if (point.y <= -windowHeight) {
						point.y = screenHeight;
					}

				} else if (key == KeyEvent.VK_DOWN) {
					point.y = point.y + speed;
					if (point.y >= screenHeight) {
						point.y = point.y - screenHeight - windowHeight;
					}
				}

				setLocation(point);
			}
		};
		this.addKeyListener(ka);

	}

	/*
	 * private void init_KeyEvent() {
	 * 
	 * KeyListener listener = new KeyListener() {
	 * 
	 * @Override public void keyTyped(KeyEvent e) {
	 * 
	 * }
	 * 
	 * @Override public void keyReleased(KeyEvent e) {
	 * System.out.println("--Ű�� ��������--");
	 * 
	 * }
	 * 
	 * @Override public void keyPressed(KeyEvent e) {
	 * System.out.println("--Ű�� ��������--");
	 * 
	 * } };
	 * 
	 * // Ű �̺�Ʈ ��� this.addKeyListener(listener);
	 * 
	 * }
	 */

	public static void main(String[] args) {
		new KeyEventTest();

	}

}
