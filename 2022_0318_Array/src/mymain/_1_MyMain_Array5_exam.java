package mymain;

import java.util.Scanner;

import myutil.LottoForLoop;
import myutil.LottoHashSet;

public class _1_MyMain_Array5_exam {

	public static void main(String[] args) {
		// lottery
		
		Scanner scanner = new Scanner(System.in);
		
		int[] userNo = new int [6];
		String yn = "y";
		
		//��÷����
		LottoForLoop lotto = new LottoForLoop();
		lotto.makeWinNo();
		lotto.makeBonusNo();
		
		while(true) {
		System.out.print("���� 6���� �Է��ϼ���: ");
		userNo[0] = scanner.nextInt();
		userNo[1] = scanner.nextInt();
		userNo[2] = scanner.nextInt();
		userNo[3] = scanner.nextInt();
		userNo[4] = scanner.nextInt();
		userNo[5] = scanner.nextInt();
		
		
		// �ζǰ�ü���� �Է°� �Ѱ��ֱ�
		lotto.setUserNo(userNo);
		
		
		// �ζǰ�ü�κ��� ����ϱ�
		lotto.makeRank();
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
