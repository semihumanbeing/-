package mymain;

public class _Q01 {

	public static void main(String[] args) {
		
		// ���� �簢�� �����
		for(int k = 1; k<=5; k++) {
		for(int i = 1; i<=5;i++) {
			System.out.print("* ");
		}
		System.out.println();
		}
		
		System.out.println("-- �ﰢ�� 1 --");
		
		// ���� �ﰢ�� �����
		for(int i = 1; i<=5; i++){//�� {
			for(int k = 1; k<=5;k++){//�� 
			if(k<=i) {
			System.out.print("* "); 
			} else System.out.print(" ");
				
			}
			System.out.println();
		}
		
		System.out.println("-- �ﰢ�� 2 --");
		
		// ���� �ﰢ�� �����
		for(int i = 1; i<=5; i++){//�� {
			for(int k = 1; k<=5;k++){//�� 
			if(k>=i) {
			System.out.print("* "); 
			} else System.out.print("  ");
				
			}
			System.out.println();
		}
		
		System.out.println("-- �ﰢ�� 3 --");
		
		// ���� �ﰢ�� �����
		for(int i = 1; i<=5; i++){//�� {
			for(int k = 1; k<=5;k++){//�� 
			if(k>=6-i) {
			System.out.print("* "); 
			} else System.out.print("  ");
				
			}
			System.out.println();
		}
				
		System.out.println("-- �ٶ����� --");
		
		// ���� �ٶ����� �����
		for(int i = 1; i<=5; i++){//�� {
			for(int k = 1; k<=5;k++){//�� 
			if(i==k || i==6-k) {
			System.out.print("  "); 
			} else System.out.print("* ");
				
			}
			System.out.println();
		}
		
		
		
	}


	}


