package mymain;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class _02_ThreadTest_BlockSync extends JFrame {

	JButton redButton,yellowButton,greenButton;
	
	//���� Ŭ����(inner class): �ܺ�Ŭ������ ��� ��Ҹ� ����� �� �ִ�
	class SignalRunnable implements Runnable{

		@Override
		public void run() {
			// �����带 �����ϱ����� run�޼��带 �̿��Ҽ��ְ� ���ִ� �������̽�
			String name = Thread.currentThread().getName();
			while(true) {
				if(name.equals("R")) {
					synchronized(this) {
						redButton.setBackground(Color.red);
						yellowButton.setBackground(Color.gray);
						greenButton.setBackground(Color.gray);
						try {
							Thread.sleep(500);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
					}
					
				} else if (name.equals("Y")){
					synchronized (this) {
						redButton.setBackground(Color.gray);
						yellowButton.setBackground(Color.yellow);
						greenButton.setBackground(Color.gray);
						try {
							Thread.sleep(500);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
					}
				} else if (name.equals("G")) {
					synchronized (this) {
					}
					redButton.setBackground(Color.gray);
					yellowButton.setBackground(Color.gray);
					greenButton.setBackground(Color.green);
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
						
				}
			}
		}
		
	}
	
	public _02_ThreadTest_BlockSync() {

		super("������ ����ȭ");
		
		this.setLayout(new GridLayout(1,3));
		this.add(redButton = new JButton());
		this.add(yellowButton = new JButton());
		this.add(greenButton = new JButton());
		
		redButton.setBackground(Color.red);
		yellowButton.setBackground(Color.yellow);
		greenButton.setBackground(Color.green);
		
		//Thread ���ఴü ����
		Runnable runnable = new SignalRunnable();
		Thread redThread = new Thread(runnable, "R");
		Thread yellowThread = new Thread(runnable, "Y");
		Thread greenThread = new Thread(runnable, "G");
		
		//Thread�� �����Ϸ��� start�޼��带 ����ؾ��Ѵ�.
		redThread.start();
		yellowThread.start();
		greenThread.start();
		
		
		//��ġ ���ϱ�
		this.setLocation(200, 100);
		//ũ�����ϱ�
		this.setSize(300, 120);

		this.setVisible(true);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		new _02_ThreadTest_BlockSync();

	}

}
