import java.util.Scanner;

public class _Q3 {

	public static void main(String[] args) {
		// ������ / (Űm * Űm)
		// ��ü�� - 20�̸� / ���� - 20-24 / ��ü�� - 25-29 / �� - 30~
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("�����Ը� �Է��ϼ���: ");
		double weight = scanner.nextDouble();
		
		System.out.print("Ű�� �Է��ϼ���: ");
		double heightC = scanner.nextDouble();
		double heightM = heightC / 100.0;
		
		double bmi = weight / (heightM * heightM);
		
		System.out.printf("Ű: %.1fcm\n", heightC);
		
		if (bmi < 20) {
			System.out.printf("BMI : %.1f [��ü��]\n", bmi);
		} else if (bmi > 20 && bmi < 24) {
			System.out.printf("BMI : %.1f [����]\n", bmi);
		} else if (bmi > 25 && bmi < 29) {
			System.out.printf("BMI : %.1f [��ü��]\n", bmi);
		} else if (bmi > 30) {
			System.out.printf("BMI : %.1f [��]\n", bmi);
		}
			
		
		
		scanner.close();

	}

}
