package mymain;

import myutil.MyDate;

public class MyMain_MyDate {

	public static void main(String[] args) {
		
		MyDate in = new MyDate();
		
		// in.year = 2022; // ������������� ��� �ʵ�� ����� ���� ��Ģ���� �Ѵ�.
		in.setYear(2022);
		
		// in.month // ��� ���� �ڽ��̳� ���� ��Ű���� �ƴϸ� ����� �� ����.
		in.setMonth(3); 
		
		// in.day // ��������, �ڽ� �ܿ��� ��� ����
		in.setDay(14);
		
		// default : ���� ��Ű���϶���
		in.setWeekday(2);
		
		System.out.printf("year: %d\n", in.getYear());
		System.out.printf("month: %d\n", in.getMonth());
		System.out.printf("day: %d\n", in.getDay());
		System.out.printf("weekday: %d\n", in.getWeekday());
		// ��ü�� �������ų� ���� �����Ҷ� ���������� �����ϴ� ���� �ƴ϶� 
		// getter �� setter�� �����Ͽ� ����ϴ� ���� �Ϲ����̴�.
		
		in.display();

		
	}

}
