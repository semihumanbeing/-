package mymain;

import java.awt.CardLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class _06_CardLayoutTest extends JFrame {

	JPanel mainPanel;
	CardLayout card;
	
	
	public _06_CardLayoutTest() {

		super("CardLayout ����");
		
		// �޴� ����
		init_menubar();
		//ī�� ���̾ƿ��ʱ�ȭ
		init_cardLayout();
		//�г� �����
		
		
		
		//------------------------------------------------------
		

		//��ġ ���ϱ�
		this.setLocation(200, 100);
		//ũ�����ϱ�
		this.setSize(400, 400);

		this.setVisible(true);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	
	private void init_cardLayout() {
		card = new CardLayout();
		mainPanel = new JPanel(card); // cardlayout�� JPanel�� �ݿ�
		
		mainPanel.add(new Screen1(),"s1");
		mainPanel.add(new Screen2(),"s2");
		mainPanel.add(new Screen3(),"s3");
		
		this.add(mainPanel,"Center");
		
	}

	private void init_menubar() {
		JPanel p = new JPanel(new GridLayout(1,3));
		//�гο� ��ư �ֱ�
		JButton btn1 = new JButton("ȭ��1");
		JButton btn2 = new JButton("ȭ��2");
		JButton btn3 = new JButton("ȭ��3");
		p.add(btn1);
		p.add(btn2);
		p.add(btn3);
		//�г� ��� ������ ������ ���ϱ�
		this.add(p,"North");
		
		//��ư �̺�Ʈ ���
		
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				card.show(mainPanel, "s1");
			}
		});
		
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				card.show(mainPanel, "s2");
			}
		});
		
		btn3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//card.show(mainPanel, "s3");
				card.last(mainPanel);
			}
		});
	}

	public static void main(String[] args) {
		new _06_CardLayoutTest();

	}

}
