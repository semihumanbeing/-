import java.util.Scanner;

public class _Q1 {

	public static void main(String[] args) {
		
		// 1. �ݾ��� �Է¹޴´�
		// 2. ������ ������ ���ϱ�
		
		Scanner scanner = new Scanner(System.in);
		int amount;
		int cash_50000; // 5������ ���� ����
		int cash_10000; // 1������ ���� ����
		int cash_5000; //  5õ���� ���� ����
		int cash_1000; //  1õ���� ���� ����
		int cash_500; //  500���� ���� ����
		int cash_100; //  100���� ���� ����
		int cash_10; //  10���� ���� ����
		int cash;
		
		System.out.print("�ݾ��� �Է��ϼ���: ");
		cash = amount = scanner.nextInt();
		
		//50000���� ���� ���ϱ�
		cash_50000 = cash / 50000;
		
		cash = cash % 50000;
		
		//10000���� ���� ���ϱ�
		cash_10000 = cash / 10000;
		
		cash = cash % 10000;
		
		//5000���� ���� ���ϱ�
		cash_5000 = cash / 5000;
		
		cash = cash % 5000;
		
		//1000���� ���� ���ϱ�
		cash_1000 = cash / 1000;
		
		cash = cash % 1000;
		
		//500���� ���� ���ϱ�
		cash_500 = cash / 500;
		
		cash = cash % 500;
		
		//100���� ���� ���ϱ�
		cash_100 = cash / 100;
		
		cash = cash % 100;
		
		//10���� ���� ���ϱ�
		cash_10 = cash / 10;
		
		cash = cash % 10;
		
		
		
		System.out.printf("--[%d(��)�� ���� ������ ����]--\n", amount);
		System.out.printf("5���� �� ����: %d��\n", cash_50000);
		System.out.printf("1���� �� ����: %d��\n", cash_10000);
		System.out.printf("5õ�� �� ����: %d��\n", cash_5000);
		System.out.printf("1õ�� �� ����: %d��\n", cash_1000);
		System.out.printf("500�� �� ����: %d��\n", cash_500);
		System.out.printf("100�� �� ����: %d��\n", cash_100);
		System.out.printf("10�� �� ����: %d��\n", cash_10);
		
		
		
		
		
		
		
		
		
		
		scanner.close();

	}

}
