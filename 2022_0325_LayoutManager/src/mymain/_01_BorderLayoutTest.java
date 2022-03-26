package mymain;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class _01_BorderLayoutTest extends JFrame {

	public _01_BorderLayoutTest() {

		super("border layout ����");

		JButton jbtEast = new JButton("East");
		JButton jbtWest = new JButton("West");
		JButton jbtSouth = new JButton("South");
		JButton jbtNorth = new JButton("North");
		JButton jbtCenter = new JButton("Center");

		this.add(jbtEast,"East");
		this.add(jbtWest,"West");
		this.add("South",jbtSouth);
		this.add(BorderLayout.NORTH, jbtNorth);
		this.add(jbtCenter);
		

		// ��ġ ���ϱ�
		this.setLocation(200, 100);

		this.setSize(400, 400);

		this.setVisible(true);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		new _01_BorderLayoutTest();

	}

}
