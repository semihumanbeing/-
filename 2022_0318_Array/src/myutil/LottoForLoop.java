package myutil;

import java.util.Arrays;
import java.util.Random;

public class LottoForLoop {

	int[] userNumbers; // ����ڰ� ������ ��ȣ
	int[] winningNumbers; // ��÷��ȣ
	int bonusNumber = 0;
	int count;
	boolean bonusNumberMatched = false;

	Random random = new Random();

	public void setUserNo(int[] userNo) {
		this.userNumbers = userNo;
	}

	public void makeWinNo() {
		int winningNumberAmount = 6;
		winningNumbers = random.ints(1, 46).distinct().limit(winningNumberAmount).toArray();
		// �ߺ��� üũ
		// ��������ȣ�� ������ �տ� 6�ڸ� ��Ʈ
		Arrays.sort(winningNumbers, 0, 6);
		// ���ʽ� ���� ����

	}

	public void makeBonusNo() {
		while(bonusNumber == 0) {
			int proposedBonusNumber = random.nextInt(45) + 1;
			boolean anyDuplicates = false;
			
			for(int winningNumber: winningNumbers) {
				if(proposedBonusNumber == winningNumber) {
					anyDuplicates = true;
				}
			}
			if(anyDuplicates == false) {
				bonusNumber = proposedBonusNumber;
			}
		}
	}

	public void makeRank() {
		// ������
		// 1�� : 6�� ��ġ, 2�� : 5�� ��ġ + ���ʽ�, 3�� : 5�� ��ġ, 4�� : 4�� ��ġ
		int matchedNumbers = 0;

		for (int userNumber : userNumbers) {
			for (int winningNumber : winningNumbers) {
				if (userNumber == winningNumber) {
					matchedNumbers = matchedNumbers + 1;
				} else if (userNumber == bonusNumber) {
					bonusNumberMatched = true;

				}
			}
		}

		count = matchedNumbers;
		if (bonusNumberMatched) count = count + 1;
	}

	public void display() {
		System.out.println("---��÷���---");
		System.out.print("��÷��ȣ: ");
		for (int i = 0; i < winningNumbers.length; i++) {
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
		System.out.printf("%d�� ���� / ���ʽ� %b\n", count, bonusNumberMatched);
		if (count == 6 && bonusNumberMatched == true) {
			System.out.println("2��!!!");
		} else if (count == 6) {
			System.out.println("1��!!!!");
		} else if (count == 5) {
			System.out.println("3��!!");
		} else if (count == 4) {
			System.out.println("4��!");
		} else if (count <= 3) {
			System.out.println("��");
		}

	}

}
