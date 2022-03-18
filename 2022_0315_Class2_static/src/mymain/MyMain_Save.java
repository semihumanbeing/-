package mymain;

import myutil.Save;

public class MyMain_Save {

	public static void main(String[] args) {
		
		// static ������ ��ü ������ ���� �ʰ� ����� �� �ִ�.
		// ���: class��.������ = ��;
		
		Save.rate = 0.2;
		
		Save s1 = new Save("�ϱ浿", 1000000);
		Save s2 = new Save("�̱浿", 2000000);
		Save s3 = new Save("��浿", 3000000);
		
		System.out.printf("----[����: %.0f%%]----\n",Save.rate*100);
		s1.display();
		s2.display();
		s3.display();
		
		// static ������ ��������(�� ��ü�� ��� �̿��� �� �ִ�.)
		s1.rate = 0.15;

		System.out.printf("----[����: %.0f%%]----\n",Save.rate*100);
		s1.display();
		s2.display();
		s3.display();
	}

}
