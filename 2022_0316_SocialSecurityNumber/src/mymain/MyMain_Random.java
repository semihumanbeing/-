package mymain;

import java.util.Random;

public class MyMain_Random {
	public static void main(String[] args) {
		
	
	Random random = new Random();
	
	int number = random.nextInt(3); // 0base �� 0���� ���ڱ��� ����� ��(0,1,2)
	
	System.out.println(number);
	
	// 1~45 �� ���� �߻���Ű��
	
	number = random.nextInt(45)+1;
	System.out.println(number);

}
}