package mymain;

import java.util.Scanner;

public class _Q3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//�̸� �ּ� ������ ����
		String name;
		String address;
		
		System.out.print("�̸��� �Է��ϼ���: ");
		name = scanner.nextLine(); // ���ڿ� �Է¹ޱ�
		System.out.print("�ּҸ� �Է��ϼ���: ");
		address = scanner.nextLine();
		
		System.out.println("--[�Է¹��� ����]--");
		System.out.printf("�̸�: %s\n�ּ�: %s", name, address);
		
		scanner.close();

	}

}
