package mymain;

import java.util.Scanner;

import myutil.Lotto;

public class _05_MyMain_Lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int [] user_no = new int[6];
		String yn = "y";
		
		Lotto lotto = new Lotto();
		
		//��÷����
		lotto.makeWin_no();
		
		
		while(true) {
			System.out.print("���� 6�� �Է��ϼ���:");
			user_no[0] = scanner.nextInt();
			user_no[1] = scanner.nextInt();
			user_no[2] = scanner.nextInt();
			user_no[3] = scanner.nextInt();
			user_no[4] = scanner.nextInt();
			user_no[5] = scanner.nextInt();
			
			
			//�ζǰ�ü���� �Է��� ��ȣ�� �Ѱ��ش�
			lotto.setUser_no(user_no);
			//�ζǰ�ü�κ��� ���
			lotto.display();
			
			//��?
			System.out.print("��?(y/n):");
			yn = scanner.next();
			
			//y�� �ƴϸ� ������..
			if(yn.equalsIgnoreCase("Y")==false)break;
			
		}
		
		System.out.println("---End---");
		scanner.close();
		
		
	}

}
