package myutil;

public class MyMath {
	
	//�ܺο��� ��ü���� ����
	private MyMath() {
		
	}
	
	//���� ��ü
	public static int plus(int a, int b) {
		return a+b;
	}
	
	public static int hap(int n) {
		int sum = 0;
		for(int i=0; i<=n; i++) {
			sum = sum+i;
		}
		return sum;
	}

}
