package mymain;

import java.util.Scanner;

public class _01_If_1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int kor; // ��������
		String grade = "A";
		
		System.out.printf("���������� �Է��ϼ���: ");
		kor = scanner.nextInt();
		
		// ��� ����ϱ�
		// A = 90 ~ 100
		// B = 80 ~ 89
		// C = 70 ~ 79
		// D = 60 ~ 69
		// F = 0  ~ 59
		
		if (kor >= 90 && kor <= 100) {
			grade = "A";
			System.out.printf("����� ������ %d��, ����� %s �Դϴ�", kor, grade);
		} else if (kor >= 80 && kor < 90) {
			grade = "B";
			System.out.printf("����� ������ %d��, ����� %s �Դϴ�", kor, grade);
		} else if (kor >= 70 && kor < 80) {
			grade = "C";
			System.out.printf("����� ������ %d��, ����� %s �Դϴ�", kor, grade);	
		} else if (kor >= 60 && kor < 70) {
			grade = "D";
			System.out.printf("����� ������ %d��, ����� %s �Դϴ�", kor, grade);
		} else if (kor >= 0 && kor < 60) {
			grade = "F";
			System.out.printf("����� ������ %d��, ����� %s �Դϴ�", kor, grade);
		} else {
			System.out.println("not valid");
		}
		
		scanner.close();

	}

}
