package mymain;

import java.util.Random;

public class _1_MyMain_Array3 {
	// Ȱ���ϱ�
	public static void main(String[] args) {
		
	// �� ���� ������ ���� �迭�� �����
	int[] monthArray = {31,28,31,30,31,30,31,31,30,31,30,31};
	
	Random random = new Random();
	int month = random.nextInt(12)+1;
	
	int lastDay = monthArray[month-1];
	
	System.out.printf("%d���� %d�ϱ��� �ֽ��ϴ�.\n", month, lastDay);
	
	// Ȱ���ϱ� 2
	

	}

}
