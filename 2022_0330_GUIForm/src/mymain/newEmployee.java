package mymain;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class newEmployee extends JFrame {

	public newEmployee() {

		super("������");

		// �Է���Ʈ��
		initNorthInputComponents();
		// �ڱ�Ұ�â
		initCenterText();
		// ��������
		initButtons();

		// ��ġ ���ϱ�
		this.setLocation(200, 100);
		// ũ�����ϱ�
		//this.setSize(300, 400);
		pack();
		this.setResizable(true);

		this.setVisible(true);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	private void initNorthInputComponents() {
		JPanel northP = new JPanel(new GridLayout(6, 1));

		FlowLayout fl = new FlowLayout(FlowLayout.LEFT);
		// 1����
		JPanel p1 = new JPanel(fl);
		JLabel namelabel = new JLabel("��       ��: ",JLabel.RIGHT);
		JTextField nameText = new JTextField(10);
		JLabel genderlabel = new JLabel("�� ��: ",JLabel.RIGHT);
		JRadioButton malebutton = new JRadioButton("��");
		JRadioButton femalebutton = new JRadioButton("��");
		ButtonGroup bg = new ButtonGroup();
		bg.add(malebutton);
		bg.add(femalebutton);
		
		p1.add(namelabel);
		p1.add(nameText);
		p1.add(genderlabel);
		p1.add(malebutton);
		p1.add(femalebutton);
		// 2����
		JPanel p2 = new JPanel(fl);
		JLabel ssn = new JLabel("�ֹι�ȣ: ",JLabel.RIGHT);
		JTextField ssnfield1 = new JTextField(10);
		JLabel space = new JLabel("-");
		JTextField ssnfield2 = new JTextField(10);
		p2.add(ssn);
		p2.add(ssnfield1);
		p2.add(space);
		p2.add(ssnfield2);
		// 3����
		JPanel p3 = new JPanel(fl);
		JLabel address = new JLabel("��       ��: ",JLabel.RIGHT);
		JTextField addressText = new JTextField(30);
		p3.add(address);
		p3.add(addressText);
		
		// 4����
		JPanel p4 = new JPanel(fl);
		JLabel department = new JLabel("��  ��  ��: ",JLabel.RIGHT);
		String[] depArray = {"�ѹ���","�ʹ��Ա��","�����������󰨻��","������","�������ģ��"};
		JComboBox<String> departmentBox = new JComboBox<String>(depArray);
		p4.add(department);
		p4.add(departmentBox);
		
		// 5����
		JPanel p5 = new JPanel(fl);
		JLabel hobby = new JLabel("��        ��: ",JLabel.RIGHT);
		JCheckBox hobbyCheckbox1 = new JCheckBox("�");
		JCheckBox hobbyCheckbox2 = new JCheckBox("����");
		JCheckBox hobbyCheckbox3 = new JCheckBox("��ȭ");
		JCheckBox hobbyCheckbox4 = new JCheckBox("����");
		p5.add(hobby);
		p5.add(hobbyCheckbox1);
		p5.add(hobbyCheckbox2);
		p5.add(hobbyCheckbox3);
		p5.add(hobbyCheckbox4);
		// 6����
		JPanel p6 = new JPanel(fl);
		JLabel profile = new JLabel("�ڱ�Ұ�",JLabel.RIGHT);
		p6.add(profile);

		// �� �г��� north �гο� �߰��Ѵ�.

		northP.add(p1);
		northP.add(p2);
		northP.add(p3);
		northP.add(p4);
		northP.add(p5);
		northP.add(p6);

		this.add(northP, "North");
		
		Dimension d = new Dimension(60,20);
		namelabel.setPreferredSize(d);
		genderlabel.setPreferredSize(d);
		ssn.setPreferredSize(d);
		address.setPreferredSize(d);
		department.setPreferredSize(d);
		hobby.setPreferredSize(d);
		profile.setPreferredSize(d);
		

	}

	private void initCenterText() {
		JTextArea textProfile = new JTextArea();
		JScrollPane jsp = new JScrollPane(textProfile);
		jsp.setPreferredSize(new Dimension(100,150));
		this.add(jsp,"Center");
		
		
		

	}

	private void initButtons() {
		JPanel p = new JPanel();
		JButton saveButton = new JButton("����");
		JButton exitButton = new JButton("����");
		exitButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
		
		p.add(saveButton);
		p.add(exitButton);
		
		this.add(p, "South");
	}

	public static void main(String[] args) {
		new newEmployee();

	}

}
