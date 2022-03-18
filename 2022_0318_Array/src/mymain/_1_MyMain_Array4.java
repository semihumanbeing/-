package mymain;

import java.util.Arrays;

import myutil.MyArrays;

public class _1_MyMain_Array4 {

	public static void main(String[] args) {
		// �迭������ü

		int[] nr = new int[10];
		// heap �� ������ ������ �ڵ��ʱ�ȭ

		System.out.println("--[�ʱⰪ]--");
		MyArrays.displayArray(nr);
		
		// �⺻ Java API (Arrays)
		Arrays.fill(nr, 3);
		System.out.println("--[3����ä���]--");
		MyArrays.displayArray(nr);
		
		Arrays.fill(nr, 2, 3, 5);
		System.out.println("--[3��°���� 4������ 5�� ä���]--");
		MyArrays.displayArray(nr);
		
		System.out.println("--[MyArrays�� �����]--");
		MyArrays.fill(nr, 2);
		MyArrays.displayArray(nr);
				
		MyArrays.fill(nr, 3, 7, 5);
		MyArrays.displayArray(nr);
		
		//sort ������� array �����ϱ� (������������ ����)
		System.out.println("--[sort ������� array �����ϱ� (������������ ����)]--");
		int [] mr = {6,3,2,1,7,9,8,5,4};
		Arrays.sort(mr);
		MyArrays.displayArray(mr);
		
		// �������� ���� �޼��� �����
		System.out.println("--[�������� ���� �޼��� �����]--");
		MyArrays.sortAscending(mr);
		MyArrays.displayArray(mr);
		
		// �������� ���� �޼��� �����
		System.out.println("--[�������� ���� �޼��� �����]--");
		MyArrays.sortDescending(mr);
		MyArrays.displayArray(mr);
		
		// �κ� sort
		Arrays.sort(mr,3,7);
		System.out.println("---[3~7��°�� �����ϱ�]--");
		MyArrays.displayArray(mr);
		
		System.out.println("---[�κ����� �޼��� �����]--");
		MyArrays.sortAscending(mr, 3, 7);
		MyArrays.displayArray(mr);
		
		// JDK 5.0 ���ĺ��� ����
		// ������ For Loop
		System.out.println("---[÷��]---");
		for(int i =0; i<5;i++) {
			System.out.printf("%d %d\n", i, mr[i]);
		}
		
		System.out.println("---[������ loop]---");
		for(int i : mr) {
			System.out.println(i);
		}
		
		String [] fruitArray = {"���", "����", "����", "����", "����"};
		for(String fruit : fruitArray) {
			System.out.println(fruit);
		}
		
		
	}

}
