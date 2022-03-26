package mymain;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class _03_GridLayoutTest extends JFrame {

	public _03_GridLayoutTest() {

		super("GridLayout ����");

		// Layout ����
		GridLayout gl = new GridLayout(6, 4); // ���� ���ڰ� ������ �־ ���� ���ڸ� �������� ������ �ȴ�.
		this.setLayout(gl);

		for (int i = 0; i <= 24; i++) {
			String title = String.format("%02d", i);
			JButton jbt = new JButton(title);
			this.add(jbt);
		}

			// ��ġ ���ϱ�
			this.setLocation(200, 100);
		// ũ�����ϱ�
		this.setSize(400, 400);

		this.setVisible(true);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		new _03_GridLayoutTest();

	}

}
