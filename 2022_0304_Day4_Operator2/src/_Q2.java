import java.util.Scanner;

public class _Q2 {

	public static void main(String[] args) {
		// �µ� ��ȯ ���� -> ȭ�� 
		// ���� -> ȭ�� F =(c * 9 / 5) + 32
		// ȭ�� -> ���� C = (F - 32) * 5 / 9
		
		Scanner scanner = new Scanner(System.in);
		double c = 7;
		double resultF;
		
		double f = 44.6;
		double resultC;
		
		resultF = (c * 9 / 5) + 32;
		resultC = (f - 32) * 5 / 9;
		
		System.out.printf("���� [%.1f] -> ȭ�� [%.1f] \n", c, resultF);
		System.out.printf("ȭ�� [%.1f] -> ���� [%.1f] \n", f, resultC);
		
		
		
		
		scanner.close();

	}

}
