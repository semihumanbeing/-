package mymain;

import java.util.Scanner;

public class _02_Switch_3 {

	public static void main(String[] args) {
		
		// 1. ���������� �Է¹޴´�
		// 2. switch ���� �̿��ؼ� ����� �����ϼ��� (a/b/c/e/f) - ���� Ȱ���ϱ�
		// 
		
		Scanner scanner = new Scanner(System.in);
		int kor;
		String grade = "F";
		
		System.out.printf("���������� �Է��ϼ���: ");
		kor = scanner.nextInt();
		
		
		// 
		if (kor>=0 && kor <=100) {
		switch(kor/10) {
		case 9, 10 : grade = "A"; break;
		case 8 : grade = "B"; break;
		case 7 : grade = "C"; break;
		case 6 : grade = "D"; break;
		
		default : grade = "F";
		
		} System.out.printf("����: %d ���: %s", kor, grade);
		}else {
			System.out.println("��ȿ�� ���ڰ� �ƴմϴ�.");
		}
		
		
		
		scanner.close();

	}

}
