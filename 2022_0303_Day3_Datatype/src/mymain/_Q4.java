package mymain;

import java.util.Scanner;

public class _Q4 {

	public static void main(String[] args) {
		//���� ������ �Է��� ����ϴ� ���α׷��� �ۼ��ϼ���.
		// �̸�, ����, �ּ�, Ű, ������
		
		Scanner scanner = new Scanner(System.in);
	
		
		System.out.print("�̸��� �Է��ϼ���: ");
		String name = scanner.nextLine(); // ���ڿ� �Է¹ޱ�
		
		System.out.print("���̸� �Է��ϼ���: ");
		int age = scanner.nextInt();
		
		System.out.print("�ּҸ� �Է��ϼ���: ");
		String address = scanner.nextLine();
		
		scanner.nextLine();
		
		System.out.print("Ű�� �Է��ϼ���: ");
		double height = scanner.nextDouble();
		
		System.out.print("�����Ը� �Է��ϼ���: ");
		double weight = scanner.nextDouble();
		
		System.out.println("--[�Է¹��� ����]--");
		System.out.printf("�̸�: %s\n����: %d\n�ּ�: %s\nŰ: %.1f\n������: %.1f\n", name, age, address, height, weight);
		
		scanner.close();

	}

}
