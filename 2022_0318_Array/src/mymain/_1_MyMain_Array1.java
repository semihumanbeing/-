package mymain;

public class _1_MyMain_Array1 {
	
	static void displayArray(int[] mr2) { // �������� �ƹ��ų� �ᵵ��
		for(int i = 0; i < mr2.length; i++) {
			System.out.printf("%2d ", i,mr2[i]);			
		}
	}
	

	public static void main(String[] args) {
		
		int []mr = new int[4];
		
		System.out.printf("mr length = %d",mr.length);
		
		mr[0] = 1;
		mr[1] = 2;
		mr[2] = 3;
		mr[3] = 4;
		
		System.out.println("---[mr �迭 ���]---");
		
		for(int i = 0; i<mr.length;i++) {		
		System.out.printf("mr %d = %d\n", i,mr[i]);
		}
		
		// �迭���
		
		
		System.out.println("---[mr �迭 ���(displayArray)]---");
		displayArray(mr);
		

	}

}
