package mymain;

import java.util.Scanner;

public class _01_If_3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int kor; // ��������
		String grade = "F";
		
		System.out.printf("���������� �Է��ϼ���: ");
		kor = scanner.nextInt();
		
		// ��� ����ϱ�
		// A = 90~92(A-) 93~95(A) 96~100(A+)
		// B = 80~82(B-) 83~85(B) 86~89(B+)
		// C = 70~72(C-) 73~75(C) 76~79(C+)
		// D = 60~62(D-) 63~65(D) 66~69(D+)
		// F = 0  ~ 59
		

		if (kor >= 0 && kor <= 100) {
			if(kor>=96) grade = "A+";
			else if(kor>=93) grade = "A";
			else if(kor>=90) grade = "A-";
			
			else if(kor>=86) grade = "B+";
			else if(kor>=83) grade = "B";
			else if(kor>=80) grade = "B-";
			
			else if(kor>=76) grade = "C+";
			else if(kor>=73) grade = "C";
			else if(kor>=70) grade = "C-";
			
		
			System.out.printf("����� ������ %d��, ����� %s �Դϴ�", kor, grade);
		}
		else {
			System.out.printf("�Էµ� ���� %d�� ��ȿ���� �ʽ��ϴ�.", kor);
		}
		
	}

}
