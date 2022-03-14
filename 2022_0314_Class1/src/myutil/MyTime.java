package myutil;

import java.util.Calendar;

// Constructor �޼���
	// 1. ��ü�� ������ �� ȣ��Ǵ� �޼���
	// 2. ����: Ŭ�����̸�();
	// 3. ��ȯ���� ����.
	// 4. Ŭ������ �ʱ�ȭ ����� �����ϴ� �޼���
	// 5. method overload �� �����ϴ�.
	// 6. ��������: JVM�� �ڵ������ؼ� ó���Ѵ�.
	


public class MyTime {
	
	// Member Field : heap �޸� ������ �����ȴ�. �ڵ� �ʱ�ȭ (����: 0 ����: false ��������: null)
	//              
	private int hour ;
	private int minute;
	private int second;
	
	
	//default ������
	public MyTime() {
		System.out.println("-----MyTime()-----");
		Calendar c = Calendar.getInstance();
		hour = c.get(Calendar.HOUR_OF_DAY);// 24�ð���
		minute = c.get(Calendar.MINUTE);
		second = c.get(Calendar.SECOND);

	}
	
	// overload �� ������
	public MyTime(int h) {
		this(); // this ������ : MyTime() �� ȣ�� 
		//this �����ڴ� ������ ù��° ������� ����Ǿ���Ѵ�.
		hour = h;
		
		
				
	}
	
	public MyTime(int h, int m, int s) {
		hour = h;
		minute = m;
		second = s;
		
	}
	
	public MyTime(int h, int m) {
		hour = h;
		minute = m;
		second = 1;
		
	}
	
	
	
	

	public void display() {
			System.out.printf("%02d:%02d:%02d", hour, minute, second);
	
		}

}
