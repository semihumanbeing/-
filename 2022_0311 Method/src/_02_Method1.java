import java.util.Scanner;

import myutil.Myinfo;

public class _02_Method1 {

	public static void main(String[] args) {
		Myinfo myInfo = new Myinfo();
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.print("����⵵�� �Է��ϼ���: ");
		int year = scanner.nextInt();
		
		System.out.print("Ű/�����Ը� �Է��ϼ���: ");
		double height = scanner.nextInt();
		double weight = scanner.nextInt();
		
		int age = myInfo.getAge(year);
		System.out.printf("����⵵: %d\n����: %d\n", year, age);
		
		String t = myInfo.getT(year);
		System.out.printf("%s��\n", t);
		
		String g = myInfo.getGanji(year);
		System.out.printf("%s",g);
		
		System.out.println();
		
		double a = myInfo.getBMI(height, weight);
		System.out.printf("Ű: %.1fcm\n������: %.1fkg\nBMI:%.2f\n", height, weight, a);
		
		String b = myInfo.getBMIState(a);
		System.out.printf("%s�Դϴ�.", b);
		

		scanner.close();

	}

}
