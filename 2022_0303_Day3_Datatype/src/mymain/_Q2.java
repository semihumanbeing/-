package mymain;

import java.util.InputMismatchException;
import java.util.Scanner;
import static java.lang.System.out;

public class _Q2 {
		/*
		 ���� �������� �Է¹޾Ƽ� 
		 �� �ѷ�
		 �� ����
		 ���ϴ� ���α׷��� �ۼ��ϼ���. 
		 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double pi = Math.PI;
		
		try{
			System.out.print("�������� �Է��ϼ���: ");
			// �������� ������ ����
			double radius = scanner.nextDouble();
			//���ѷ� (2����*������)
			double circle_length = radius * (pi * 2);
			//������ (������*������*����)
			double circle_area = radius * radius * pi;
					
			System.out.printf("�������� %.1f���϶�\n", radius);
			System.out.printf("���ѷ� = %.1f ��\n", circle_length );
			System.out.printf("������ = %.1f ��", circle_area );
		
			
		}
		catch(InputMismatchException e){
			System.out.println("You entered in a wrong type " + e);
		}
		catch(Exception e) {
			System.out.println("blah blah error encountered" + e);
		}
		
		
		scanner.close();
		
		
	}

}
