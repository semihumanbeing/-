package mymain;

import java.util.Scanner;

public class _02_Switch_2 {

	public static void main(String[] args) {
		// 1  2  3  4  5  6  7  8  9  10 11 12
		// 31 28 31 30 31 30 31 31 30 31 30 31

		Scanner scanner = new Scanner(System.in);
		int month;
		int lastDay = 0;
		String season = "�ܿ�";
		
		// if ������ ������ �� ���ϱ�
		/*
		 * System.out.print("���� �Է��ϼ���: "); month = scanner.nextInt();
		 * if (month >= 1 && month <= 12) { if(month == 1 || month == 3 || month == 5 ||
		 * month == 7 || month == 8 || month == 10 || month == 12) { lastDay = 31; }
		 * else if (month == 4 || month == 6 || month == 9 || month == 11) { lastDay =
		 * 30; } else if (month ==2) { lastDay = 28; }
		 * System.out.printf("%d���� ������ ���� %d���Դϴ�", month, lastDay); } else {
		 * System.out.println("��ȿ�� ���ڰ� �ƴմϴ�. 1~12 ���� ���� �Է��ϼ���"); }
		 */
		
		
		// switch ������ ������ �� ���ϱ� 
		
		System.out.print("���� �Է��ϼ���: "); 
		month = scanner.nextInt();
		
		switch(month) {
		case 2 : lastDay = 28; break;
		case 4, 6, 9, 11 : lastDay = 30; break;
		
		default : lastDay = 31;
		
		}
		System.out.printf("%d���� ������ ���� %d���Դϴ�\n", month, lastDay);
		
		// ��� 1
	    switch(month) {
	    case 12, 1, 2 : season = "�ܿ�"; break;
	    case 3,  4, 5 : season = "��";  break;
	    case 6,  7, 8 : season = "����"; break;
	    case 9, 10,11 : season = "����"; break;
	    }
	    System.out.printf("%d���� %s�Դϴ�\n", month, season);
	    
	    // ��� 2
	    switch(month/3) {
	    case 1 : season = "��"; break;
	    case 2 : season = "����";  break;
	    case 3 : season = "����"; break;
	    default : season = "�ܿ�";
	    }
	    System.out.printf("%d���� %s�Դϴ�", month, season);
	

		
		
		scanner.close();
	}

}
