package mymain;

import java.util.Arrays;
import java.util.Random;

public class Lotto {

	int[] userNo; // ����ڰ� ������ ��ȣ
	int[] winNo; // ��÷��ȣ

	int count = 0;

	Random random = new Random();

	public void setUserNo(int[] userNo) {
		this.userNo = userNo;
	}

	public void makeWinNo() {
		winNo = new int[7];
		for (int i = 0; i < winNo.length; i++) {
			for (int k = 0; k < i; k++) {
				int number = random.nextInt(45)+1;
				if(winNo[k]!=number) {
					winNo[i] = number;
				}
				}
		}
		// �ߺ��� üũ
		// ��������ȣ�� ������ �տ� 6�ڸ� ��Ʈ
		Arrays.sort(winNo, 0, 6);

	}

	public void makeRank() {
		// ������
		//1�� : 6�� ��ġ, 2�� : 5�� ��ġ + ���ʽ�, 3�� : 5�� ��ġ, 4�� : 4�� ��ġ
		count = 0;

	}

	public void display() {
		System.out.println("---��÷���---");
		System.out.print("��÷��ȣ: ");
		for (int i = 0; i < winNo.length - 1; i++) {
			System.out.printf("%3d", winNo[i]);
		}
		// ���ʽ���ȣ
		System.out.printf(" (%d)\n", winNo[6]);
		System.out.print("������ȣ: ");
		for (int i = 0; i < userNo.length; i++) {
			System.out.printf("%3d", userNo[i]);
		}
		System.out.println();

		// ������

	}

}
