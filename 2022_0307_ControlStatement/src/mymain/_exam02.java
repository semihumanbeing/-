package mymain;

import java.util.Scanner;

public class _exam02 {

	public static void main(String[] args) {
		
		//2������
		
		Scanner scanner = new Scanner(System.in);
		
		int n1, n2, n3;
		
		System.out.print("3���� ������ �Է��ϼ���: ");
		n1 = scanner.nextInt();
		n2 = scanner.nextInt();
		n3 = scanner.nextInt();
		
		System.out.printf("������ ����: %d %d %d", n1 , n2, n3);
		System.out.println();
		
		int min;
		int minimum;
		min = (n1 > n2) ? n2 : n1;
		minimum = (min>n3) ? n3 : min;
		System.out.printf("���� ���� ����: %d",minimum);	
		
		
		scanner.close();

	}

}
