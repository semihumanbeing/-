import java.util.Scanner;

public class _07_LogicalOperatorPractice2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		/*
		 * ����/��� 
		 * ���� ���� 
		 * 1. 400�� ����� �Ǵ� �� 
		 * 2. 4�� ����̸鼭 100�� ����� �ƴ� ��
		 */ 
		
		int year;
		System.out.printf("�⵵: ");
		year = scanner.nextInt();
		
		if((year%400 == 0) || (year%4==0 && year%100!=0)) {
		System.out.printf("%d�⵵�� �����Դϴ�. \n", year);

		} else {
		System.out.printf("%d�⵵�� ����Դϴ�. \n", year);
		}
		
			
		
		
		
		scanner.close();

	}

}
