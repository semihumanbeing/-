package mymain;

import java.util.Scanner;

public class _1_MyMain_Array5_exam {

	public static void main(String[] args) {
		// lottery
		
		Scanner scanner = new Scanner(System.in);
		
		int[] userNo = new int [6];
		String yn = "y";
		
		//��÷����
		Lotto lotto = new Lotto();
		lotto.makeWinNo();
		
		while(true) {
		System.out.println("���� 6���� �Է��ϼ���: ");
		userNo[0] = scanner.nextInt();
		userNo[1] = scanner.nextInt();
		userNo[2] = scanner.nextInt();
		userNo[3] = scanner.nextInt();
		userNo[4] = scanner.nextInt();
		userNo[5] = scanner.nextInt();
		
		
		
		// �ζǰ�ü���� �Է°� �Ѱ��ֱ�
		lotto.setUserNo(userNo);
		
		
		// �ζǰ�ü�κ��� ����ϱ�
		lotto.display();
		
		System.out.println();
		
		// �ٽ��ϱ�
		System.out.print("�ٽ��ϱ�? (y/n): ");
		yn = scanner.next();
		if (yn.equalsIgnoreCase("y")==false) break;
		}
		
		
		System.out.println("---the end---");
		scanner.close();
		
		
	}

}
