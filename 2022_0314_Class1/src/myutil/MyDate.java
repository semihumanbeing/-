package myutil;

public class MyDate {
	
	public int year;
	protected int month;
	private int day;
	int weekday;
	
	// setter �޼��� (������ ���� �ִ� �޼���)
	// ����: setField��(����) <- camel case�� �ۼ��Ѵ�.
	
	public void setYear(int y) {
		year = y;
	}
	
	public void setMonth(int m) {
		month = m;
		return; 
		// ������ return�� �ִ°����� ó���Ѵ�. void�� �ƴ� ������ return�� ���� ������ ������ ����.
	}

	public void setDay(int d) {
		day = d;
		
	}
	
	public void setWeekday(int w) {
		weekday = w;
	}
	
	// getter �޼��� (���� �������� �޼���)
	// ������ setter�� ����.
	
	public int getMonth() {
		return month;
	}

	public int getYear() {
		return year;
	}

	public int getDay() {
		return day;
	}

	public int getWeekday() {
		return weekday;
	}
	
	public void display() {
		System.out.printf("%d�� %d�� %d��\n", year, month, day);
	}

}
