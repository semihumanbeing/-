package mymain;

import java.util.Scanner;

public class _05_StringDataType {
	
	/*
	 ���ڿ� �ڷ���: String
	 ���ڿ�: 1�� �̻��� ������ ������ ��
	 //   "ABC" -> 'A' 'B' 'C'
	 ���: "ABC" 
	 ��� ����: %s
	          %ms <- ���ڼ��� m���� ���
	 
	 */

	public static void main(String[] args) {
	
		String name = "ȫ�浿";
		String address = "����� ������ ������ 123";
		System.out.println(name+"\n"+address);
		System.out.printf("�̸�: %s\n" , name);
		System.out.printf("�ּ�: %s\n" , address);
		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("�̸��� ������?");
		name = scanner.next();
		System.out.printf("%s ��� �մϴ�.", name);
		
		
		scanner.close();

	}

}
/*
 * 		
		
 */

