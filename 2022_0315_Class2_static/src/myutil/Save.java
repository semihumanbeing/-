package myutil;

public class Save {
	
	String name; // ������ �̸�
	int money; // �����
	
	public static double rate; // ���α׷� ���� �� �����Ǵ� ��������

	public Save(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	public void display() {
		System.out.printf("[%s]-[%d]-[%d]\n", name, money, (int)(money*rate));
	}
	
	
	
	

}
