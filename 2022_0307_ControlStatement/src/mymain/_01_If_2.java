package mymain;

import java.util.Scanner;

public class _01_If_2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int kor; // ��������
		String grade = "F";
		
		System.out.printf("���������� �Է��ϼ���: ");
		kor = scanner.nextInt();
		
		// ��� ����ϱ�
		// A = 90 ~ 100
		// B = 80 ~ 89
		// C = 70 ~ 79
		// D = 60 ~ 69
		// F = 0  ~ 59
		
		// ���� �� ���� �ڵ�
		
		/*
		 * if (kor >= 90 && kor <= 100) { grade = "A"; } else if (kor >= 80 && kor < 90)
		 * { grade = "B"; } else if (kor >= 70 && kor < 80) { grade = "C"; } else if
		 * (kor >= 60 && kor < 70) { grade = "D"; } else if (kor >= 0 && kor < 60) {
		 * grade = "F"; } else { System.out.println("not valid"); }
		 * System.out.printf("����� ������ %d��, ����� %s �Դϴ�", kor, grade);
		 * 
		 * scanner.close();
		 */

		if (kor >= 0 && kor <= 100) {
			if(kor>=90) grade = "A";
			else if(kor>=80) grade = "B";
			else if(kor>=70) grade = "C";
			else if(kor>=60) grade = "D";
		
			System.out.printf("����� ������ %d��, ����� %s �Դϴ�", kor, grade);
		}
		else {
			System.out.printf("�Էµ� ���� %d�� ��ȿ���� �ʽ��ϴ�.", kor);
		}
		
	}

}
