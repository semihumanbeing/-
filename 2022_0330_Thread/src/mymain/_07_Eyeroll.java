package mymain;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class _07_Eyeroll extends JFrame {
	JPanel drawPan = new JPanel();
	
	public _07_Eyeroll() {

		super("Graphics Practice");
		
		initDrawPad();

		//��ġ ���ϱ�
		this.setLocation(200, 100);
		//ũ�����ϱ�
		//this.setSize(400, 400);
		pack();
		
		this.setVisible(true);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Graphics g = drawPan.getGraphics();
		g.drawString("�ȳ��ϼ���", 0, 30);

	}

	private void initDrawPad() {
		class drawPanel extends JPanel{
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				
				
			}
		}
		drawPan = new JPanel();
		
		JPanel drawPad = new JPanel();
		drawPad.setPreferredSize(new Dimension(400,400));
		this.add(drawPad,"Center");
		
	}

	public static void main(String[] args) {
		new _07_Eyeroll();

	}

}
