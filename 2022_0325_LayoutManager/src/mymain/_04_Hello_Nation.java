package mymain;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

// 3���� ������� classȣ���ϱ�

public class _04_Hello_Nation extends JFrame {

	// Member�ν��� ���� Ŭ���� ���� (�� Ŭ���� �ȿ����� ����ϱ� ���� �뵵)
	class KorButtonEventObject implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// System.out.println(new Date(e.getWhen())); <- �ð��� ��µ�
			JOptionPane.showMessageDialog(_04_Hello_Nation.this, "�ȳ��ϼ���");

		}

	}

	public _04_Hello_Nation() {

		super("������ �λ�");
		// ���̾ƿ� �����ϱ�
		GridLayout gl = new GridLayout(6, 1);
		this.setLayout(gl);

		// ��ư �����
		JButton btnKor = new JButton("�ѱ��� �λ�");
		JButton btnEng = new JButton("���� �λ�");
		JButton btnJpn = new JButton("�Ϻ��� �λ�");
		JButton btnChn = new JButton("�߱��� �λ�");
		JButton btnGer = new JButton("���Ͼ� �λ�");
		JButton btnFra = new JButton("�������� �λ�");

		this.add(btnKor);
		this.add(btnEng);
		this.add(btnJpn);
		this.add(btnChn);
		this.add(btnGer);
		this.add(btnFra);

		// ��ư ������ �� �̺�Ʈ ����ϱ�
		// Event sort.addXXXListener (ó�� ��ü�� �����ִ� interface)
		KorButtonEventObject listener = new KorButtonEventObject();
		btnKor.addActionListener(listener);

		// �����λ�
		class EngButtonEventObject implements ActionListener {

			@Override
			public void actionPerformed(ActionEvent e) {
				// JOptionPane.showMessageDialog(_04_Hello_Nation.this, "hello");
				JOptionPane.showMessageDialog(_04_Hello_Nation.this, "Hello");
			}

		}
		// btnEng��ư�� Ŭ���Ǹ� EngButtonEventObject���� actionPerformed�� ȣ��ȴ�.
		btnEng.addActionListener(new EngButtonEventObject());

		// �Ϻ��� �λ�
		// �͸� listener����� �����
		ActionListener listener2 = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(_04_Hello_Nation.this, "����˪���");

			}
		};
		btnJpn.addActionListener(listener2);

		// �߱��� �λ�
		btnChn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(_04_Hello_Nation.this, "���Ͽ�");
			}
		});

		// lambda �� ����ϱ�
		//���Ͼ� �λ�
		btnGer.addActionListener(e->JOptionPane.showMessageDialog(_04_Hello_Nation.this, "Guten Tag"));
		
		btnFra.addActionListener(e-> JOptionPane.showMessageDialog(_04_Hello_Nation.this, "Bonjour"));

		// ----------------------------------------------------------------------------------

		// ��ġ ���ϱ�
		this.setLocation(200, 100);
		// ũ�����ϱ�
		this.setSize(400, 400);

		this.setVisible(true);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		new _04_Hello_Nation();

	}

}
