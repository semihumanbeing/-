package mymain;

import java.util.Scanner;

import myutil.SSN;

public class MyMain_SSN {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String socialSecurityNumber;
		String yn = "y";
		SSN ssn = new SSN();
		
		while(true) {
			System.out.print("�ֹι�ȣ�� �Է��ϼ���(xxxxxx-xxxxxxx): ");
			socialSecurityNumber = scanner.next(); // ���� �����ؼ� �Է� ���� �� nextLine�̿�
			
			//�ֹι�ȣ�� �ֹι�ȣ ���� ��ü���� ����			
			ssn.setSocialSecuritynumber(socialSecurityNumber);
			
			//�ΰ����� ��û(����⵵, ����, ����, ��, ����, ����, �����ڵ�, ��ȿ�� üũ)
			boolean isValid = ssn.isValid();
			boolean isValid2 = ssn.isValid2();
			int year = ssn.getYear();
			int age = ssn.getAge();
			String gender = ssn.getGender();
			String t = ssn.getT();
			String season = ssn.getSeason();
			String local = ssn.getLocal();
			String ganji = ssn.getGanji();
			
			System.out.println("---���---");
			
			if(isValid2) {
			System.out.printf("����⵵: %d\n",year);
			System.out.printf("����: %d\n",age);
			System.out.printf("����: %s\n",gender);
			System.out.printf("��: %s��\n",t);
			System.out.printf("�¾ ����: %s\n",season);
			System.out.printf("�¾ ����: %s\n",local);
			System.out.printf("����: %s\n",ganji);
			} else {
				System.out.println("�߸��� �ֹι�ȣ�Դϴ�.");
			}
			
			
			//�ٽ��ϱ�?
			System.out.print("�ٽ��ϱ�? y/n: ");
			yn = scanner.next();
			if (yn.toUpperCase().equals("Y")==false)break;
			
			
			
			
			
			
		}//end while
		
		scanner.close();
		System.out.println("---the end---");

	}

}
