package mymain;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _exam04 {

	public static void main(String[] args) {
		// 4������
		try {
		Scanner scanner = new Scanner(System.in);
		
		int n1, n2;
		String operator;
		
		System.out.printf("�ΰ��� ���ڿ� �����ڸ� �Է��ϼ���: ");
		n1 = scanner.nextInt();
		operator = scanner.next();
		n2 = scanner.nextInt();
		
		
		if(operator.equals("+"))
		{
			System.out.printf("%d + %d = %d", n1, n2, n1+n2);
		} else if(operator.equals("-"))
		{
			System.out.printf("%d - %d = %d", n1, n2, n1-n2);
		} else if(operator.equals("*"))
		{
			System.out.printf("%d * %d = %d", n1, n2, n1*n2);
		} else if(n2==0 && operator.equals("/")) 
		{
			System.out.println("0���� ���� �� �����ϴ�");
		} else if(operator.equals("/")) 
		{
			System.out.printf("%d / %d = %d", n1, n2, n1/n2);
		} else {System.out.println("���� Ȥ�� �����ڸ� ��Ȯ�� �Է��ϼ���");
		}
		scanner.close();
		} catch(InputMismatchException e) {
			System.out.println("���� Ȥ�� �����ڸ� ��Ȯ�� �Է��ϼ��� " + e);
			
		} catch(Exception e) {
			System.out.println("���� Ȥ�� �����ڸ� ��Ȯ�� �Է��ϼ��� " + e);
			
		}
		
		
		

	}

}
