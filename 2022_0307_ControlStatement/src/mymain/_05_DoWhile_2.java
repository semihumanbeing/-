package mymain;

import java.util.Scanner;

public class _05_DoWhile_2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int mTable;
		String yn = "y";
		
		do {
			System.out.print("����ΰ���?: ");		
			mTable = scanner.nextInt();	
		
		if (!(mTable>=2 && mTable <=9)) {	//2~9���̰� �ƴϸ�
			System.out.println("2~9 ������ ���� �Է��ϼ���.");
			continue;
		}
			
			for (int i=1; i<=9; i++) 
		System.out.printf("%d x %d = %d\n", mTable, i, mTable*i);
		
		
		 
		System.out.println("�ٽ��ϱ� y/n: ");
		yn = scanner.next();
		
		// String�� �� �񱳽� equals �޼��带 ����Ѵ�.
		} while(yn.equalsIgnoreCase("y"));
		
		
		scanner.close();
		System.out.println("-----the end-----");
		}
		
	}

	


