package mymain;

import java.util.Scanner;

public class _exam12 {

	public static void main(String[] args) {
		//12������
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("�Ǽ��� �Է��ϼ���");
		double d = scanner.nextDouble();
		System.out.println("������ �Է��ϼ���");
		int i = scanner.nextInt();
		double e = Math.pow(d, i);
		
		System.out.println(e);
		
		
		
		
		scanner.close();
		

	}

}
