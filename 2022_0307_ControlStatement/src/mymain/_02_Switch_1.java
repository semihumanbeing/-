package mymain;

import java.util.Scanner;

public class _02_Switch_1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String data = "����";
		String res = "��";

		System.out.print("������ �Է��ϼ���: ");
		data = scanner.next();

		switch (data) {
		case "����":
			res = "�޴�";
			break;
		case "����":
			res = "�ÿ��ϴ�";
			break;
		case "����":
			res = "���ִ�";
			break;
			
		default:
			res = "?";
		}
		System.out.printf("����: %s Ư¡: %s", data, res);


		scanner.close();
	}

}
