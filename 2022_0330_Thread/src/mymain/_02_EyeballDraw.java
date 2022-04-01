package mymain;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class _02_EyeballDraw extends JFrame {

	//�׸��� �� ����
	public static final int GRIMPAN_WIDTH  = 400;

	public static final int GRIMPAN_HEIGHT = 600;
	
	static Image back_img;
	static Image back_img_off;
	
	static Boolean bEyeInPt = false;
	
	static {
		//�޸𸮿� �ø��� �ڵ�.
		back_img = Toolkit.getDefaultToolkit().getImage("image/ĳ�η�_on.jpg");
		back_img_off = Toolkit.getDefaultToolkit().getImage("image/ĳ�η�_off.jpg");
	}
	
	
	JPanel grimPan;
	
	
	//���� ��ǥ
	Point eye_left  = new Point();
	Point eye_right = new Point();
	int   eye_radius;//���� ������
	
	//������ǥ
	Point eyeball_left  = new Point();
	Point eyeball_right = new Point();
	int eyeball_radius;
	
	
	
	public _02_EyeballDraw() {
		// TODO Auto-generated constructor stub

		super("���˱׸���");
		
		//�׸��� �ʱ�ȭ
		init_grimpan();
		
		//���� ��ġ �ʱ�ȭ
		init_eye_position();
		
		//������ ��ġ �ʱ�ȭ
		init_eyeball_position();
		
		//���콺 �̺�Ʈ �ʱ�ȭ
		init_mouse_event();
		
		
		// ��ġ x y
		this.setLocation(600, 100);
		// ũ��
		//this.setSize(400, 400);
		pack();
		
		setResizable(false);
		
		
		// �����ֱ�
		this.setVisible(true);
		// �����ڵ�
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	private void init_mouse_event() {
		// TODO Auto-generated method stub
		
		MouseAdapter adapter = new MouseAdapter() {

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				super.mousePressed(e);
				
				//������ư �˾ƺ��� �ڵ�
				/*
				int button = e.getButton();
				if(button== MouseEvent.BUTTON3) {
					bEyeInPt = true;
				}else {
					bEyeInPt = false;
				}
				*/
				
				//������ǥ
				Point pt = e.getPoint();
				//System.out.println(e);
				move_eyeball_left_position(pt);//���� ������ ��ġ
				move_eyeball_right_position(pt);//������ ������ ��ġ
				
				grimPan.repaint();//�׸��� �ٽñ׷���-> paintComponent(g) call
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				super.mouseReleased(e);
				
				//������ġ �ʱ�ȭ
				init_eyeball_position();
				grimPan.repaint();//�׸��� �ٽñ׷���-> paintComponent(g) call
			}

			@Override
			public void mouseDragged(MouseEvent e) {
				// TODO Auto-generated method stub
				super.mouseDragged(e);
				
				//��������ǥ
				Point pt = e.getPoint();
				
				move_eyeball_left_position(pt);//���� ������ ��ġ
				move_eyeball_right_position(pt);//������ ������ ��ġ
				
				grimPan.repaint();//�׸��� �ٽñ׷���-> paintComponent(g) call
				
				
			}
			
		};
		
		//�׸��ǿ� ���콺 �̺�Ʈ ����
		grimPan.addMouseListener(adapter);		//���콺 ������,������
		grimPan.addMouseMotionListener(adapter);//���콺 �巡��
		
		
		
	}

	protected void move_eyeball_right_position(Point mousept) {
		// TODO Auto-generated method stub
		
		int x = mousept.x - eye_right.x; //�غ�
		int y = mousept.y - eye_right.y; //����
		
		double r = Math.sqrt(x*x + y*y);
		
		double rate = eyeball_radius / r;
		
		//������ ��ǥ
		eyeball_right.x = (int) (eye_right.x + rate * x); 
		eyeball_right.y = (int) (eye_right.y + rate * y); 
		
		if(r<=eye_radius) {
			bEyeInPt = true;
		}else bEyeInPt = false;
		return;
		
		
	}

	protected void move_eyeball_left_position(Point mousept) {
		// TODO Auto-generated method stub
		
		int x = mousept.x - eye_left.x; //�غ�
		int y = mousept.y - eye_left.y; //����
		
		double r = Math.sqrt(x*x + y*y);
		
		double rate = eyeball_radius / r;
		
		//������ ��ǥ
		eyeball_left.x = (int) (eye_left.x + rate * x); 
		eyeball_left.y = (int) (eye_left.y + rate * y); 
		
		if(r<=eye_radius) {
			bEyeInPt = true;
		}else bEyeInPt = false;
		return;
		
		
		
	}

	private void init_eyeball_position() {
		// TODO Auto-generated method stub
		//���� �߽���ǥ�� �����ϰ�
		
		eyeball_left.x = eye_left.x;
		eyeball_left.y = eye_left.y;
		
		eyeball_right.x = eye_right.x;
		eyeball_right.y = eye_right.y;
		
		//������ ������
		eyeball_radius = eye_radius / 2;
		
		
	}

	private void init_eye_position() {
		// TODO Auto-generated method stub
		
		//���ʴ� �ʱ�ȭ
		eye_left.x = 135;//GRIMPAN_WIDTH /4;
		eye_left.y = 117;//GRIMPAN_HEIGHT /2;
		
		//�����ʴ� �ʱ�ȭ
		eye_right.x= 283;//GRIMPAN_WIDTH /4*3;
		eye_right.y= 127;//GRIMPAN_HEIGHT /2;
		
		//���� ������
		eye_radius = GRIMPAN_WIDTH/4 - 43;
		
		
	}

	private void init_grimpan() {
		// TODO Auto-generated method stub
		//                   �͸�Ŭ����
		grimPan = new JPanel() { 
			
			@Override
			protected void paintComponent(Graphics g) {
				// TODO Auto-generated method stub
				//super.paintComponent(g);
				
				//������ �׷ȴ� ��������� �ڵ�
				//g.clearRect(0, 0, GRIMPAN_WIDTH, GRIMPAN_HEIGHT);
				
				//���� ��������
				if(bEyeInPt) {
					g.drawImage(back_img_off, 0,0,this);
					return;
				}
				
				
				//����̹��� �ø���
				g.drawImage(back_img, 0, 0, this);
				
				
				//�� �׸���
				//����
				/*g.drawOval(eye_left.x-eye_radius, 
						   eye_left.y-eye_radius, 
						   eye_radius*2, 
						   eye_radius*2);
				
				//������
				g.drawOval(eye_right.x-eye_radius, 
					       eye_right.y-eye_radius, 
					       eye_radius*2, 
					       eye_radius*2);
				*/
				g.setColor(Color.black);
				
				
				//���� �׸���
				g.fillOval(eyeball_left.x - eyeball_radius, 
					       eyeball_left.y - eyeball_radius, 
					       eyeball_radius*2, 
					       eyeball_radius*2);
				
				g.fillOval(eyeball_right.x - eyeball_radius, 
					       eyeball_right.y - eyeball_radius, 
					       eyeball_radius*2, 
					       eyeball_radius*2);
				
				
				
				
				
				
				
				
				
				
			}
			
		};
		
		grimPan.setPreferredSize(new Dimension(GRIMPAN_WIDTH,GRIMPAN_HEIGHT));
		this.add(grimPan);//��ġ�����ϸ� Center
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new _02_EyeballDraw();

	}

}
