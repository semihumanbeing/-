package mymain;

import java.util.Scanner;

public class _Q1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		// Ű����κ��� �Է¹޴� ��ü ����
		// System.in <- �Է� ��ü
		// System.out <- ��� ��ü
		// ��� ��ü�� Ȱ���ϴ� ���� ��� �ֳ���?
		
		System.out.print("choose width: ");
		int width = scanner.nextInt();
		System.out.print("choose height: ");
		int height = scanner.nextInt();
				
		int area = width * height;
		//���� �Է¹޾� ���� ���
		
		System.out.printf("���� %d�� ���� %d���� �簢���� ������: %d��\n", width, height, area);
		
		scanner.close();

	}

}
