package mymain;

import java.util.Scanner;

public class MyInfo {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("�̸�: ");
		String name = scanner.next();
		
		System.out.print("����: ");
		int age = scanner.nextInt();	
		
		scanner.nextLine();
		
		System.out.print("�ּ�: ");
		String address = scanner.nextLine();
		
		System.out.print("����: ");
		double height = scanner.nextDouble();
		
		System.out.print("ü��: ");
		double weight = scanner.nextDouble();
		
		
		System.out.println("===[��������]===");
		System.out.printf("�̸�: %s\n", name);
		System.out.printf("����: %d\n", age);
		System.out.printf("�ּ�: %s\n", address);
		System.out.printf("����: %.01f(cm)\n", height);
		System.out.printf("ü��: %.01f(kg)\n", weight);
		
		
		
		
		scanner.close();

	}

}
