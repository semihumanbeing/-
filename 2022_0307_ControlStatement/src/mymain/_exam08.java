package mymain;

import java.util.Scanner;

public class _exam08 {
	public static void main(String[] args) {
		// 8������
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("�������Է��ϼ���");
		int j=scanner.nextInt();
		int sum = 0;
		
		System.out.println("n\t1���� n������ ��\n---------------------");
		for (int n = 1;n<=j;n++) 
		{
			sum = sum + n;
			System.out.printf("%d\t%d\n",n,sum);
		}
		
		
		scanner.close();
		
		
	}

}
