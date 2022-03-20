package myutil;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class LottoHashSet {

	int[] userNumbers; // ����ڰ� ������ ��ȣ
	int[] winningNumbers; // ��÷��ȣ
	int bonusNumber;
	int count;
	int bonusCount;

	Random random = new Random();

	public void setUserNo(int[] userNo) {
		this.userNumbers = userNo;
	}

	public void makeWinNo() {
		int winningNumberAmount = 7;
		winningNumbers = new int[winningNumberAmount];

		Set<Integer> winningNumbersSet = new HashSet<Integer>();
		while (winningNumbersSet.size() < winningNumberAmount) {
			int number = (random.nextInt(45)) + 1;
			winningNumbersSet.add(number);
		}
		int index = 0;
		for (Integer winningNumber : winningNumbersSet) {
			winningNumbers[index++] = winningNumber;
		}
		// �ߺ��� üũ
		// ��������ȣ�� ������ �տ� 6�ڸ� ��Ʈ
		Arrays.sort(winningNumbers, 0, 6);
		// ���ʽ� ���� ����

	}

	public void makeBonusNo() {
		bonusNumber = (random.nextInt(45)) + 1;
	}

	public void makeRank() {
		// ������
		// 1�� : 6�� ��ġ, 2�� : 5�� ��ġ + ���ʽ�, 3�� : 5�� ��ġ, 4�� : 4�� ��ġ
		Set<Integer> matchedNumbersSet = new HashSet<Integer>();
		Set<Integer> bonusNumbersSet = new HashSet<Integer>();
		for (int userNumber : userNumbers) {
			for (int winningNumber : winningNumbers) {
				if (userNumber == winningNumber) {
					matchedNumbersSet.add(userNumber);
				} else if (userNumber == bonusNumber) {
					bonusNumbersSet.add(userNumber);

				}
			}
		}

		count = matchedNumbersSet.size();
		bonusCount = bonusNumbersSet.size();
	}

	public void display() {
		System.out.println("---��÷���---");
		System.out.print("��÷��ȣ: ");
		for (int i = 0; i < winningNumbers.length - 1; i++) {
			System.out.printf("%3d", winningNumbers[i]);
		}
		// ���ʽ���ȣ
		System.out.printf(" (%d)\n", bonusNumber);
		System.out.print("������ȣ: ");
		for (int userNumber : userNumbers) {
			System.out.printf("%3d", userNumber);
		}
		System.out.println();

		// ������
		System.out.printf("%d�� ���� / ���ʽ� %d��\n",count, bonusCount);
		if ((count+bonusCount)==6) {
			System.out.println("2��!!!");
		} else if(count == 6) {
			System.out.println("1��!!!!");
		} else if(count == 5) {
			System.out.println("3��!!");
		} else if(count == 4) {
			System.out.println("4��!");
		} else if(count <= 3) {
			System.out.println("��");
		}

	}

}
