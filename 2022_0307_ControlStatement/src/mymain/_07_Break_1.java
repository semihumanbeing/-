package mymain;

public class _07_Break_1 {

	public static void main(String[] args) {
		
		// break �� �ݺ��������� ����� �� �ִ� Ż�⹮�̴�.
		// break label �� label������ �ݺ����� Ż���Ѵ�(JDK 5.0���ĺ��� ����)
		
		int sum = 0;
		int i = 1;
		while(true) {
			sum = sum+i;
			i++;
			
			if(i>10) break;
		}
		System.out.println(sum);

	OUT_FOR:
	for (int a=1;a<=5;a++) {
		for (int b=1;b<=5;b++) {
			if(a==3 && a==b)break OUT_FOR;
			System.out.printf("[%d, %d] ", a, b);
		}
		System.out.println();
	}
	}
}
