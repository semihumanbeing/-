package mymain;

import java.util.Scanner;

import myutil.VendingMachineUtil;

public class MyMain_VerndingMachine {

	public static void main(String[] args) {
		int money;
		int drink;
		Scanner scanner = new Scanner(System.in);
		VendingMachineUtil vendingmachine = new VendingMachineUtil();
		
		String y;
		do{
		System.out.print("�ݾ�: ");
		money = scanner.nextInt();
		System.out.print("���ἱ��(1.�ݶ� 2.���̴� 3.�꽺 4.����): ");
		drink = scanner.nextInt();
		
		vendingmachine.insertCoin(money);
		vendingmachine.selectDrink(drink);
		
		vendingmachine.displayResult();
		
		System.out.println();
		System.out.print("�ٽ��ϱ�? y/n ");
		y = scanner.next();
		}while (y.equalsIgnoreCase("y"));
		
		
		scanner.close();
		
	}

}
