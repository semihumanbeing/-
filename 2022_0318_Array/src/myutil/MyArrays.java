package myutil;

public class MyArrays {

	public static void displayArray(int[] ar) { // �������� �ƹ��ų� �ᵵ��
		System.out.print("[");
		for (int i = 0; i < ar.length; i++) {
			System.out.printf("%2d ", ar[i]);
		}
		System.out.println("]");

	}

	// ��� ��ҿ� val������ ä���
	public static void fill(int[] ar, int value) {
		for (int i = 0; i < ar.length; i++) {
			ar[i] = value;
		}

	}

	// ����-�� ���� �߿� value���� ä���
	public static void fill(int[] ar, int fromIndex, int toIndex, int value) {
		for (int i = fromIndex; i < toIndex; i++) {
			ar[i] = value;
		}

	}
	
	public static void sortAscending(int[] mr, int fromIndex, int toIndex) {
		for (int i=fromIndex; i<toIndex-1;i++) {
			for(int k=i+1;k<toIndex;k++) {
				if(mr[i]>mr[k]) {
					int im = mr[i];
					mr[i] = mr[k];
					mr[k] = im;
				}
			}
		}

	}
	
	//�������� ����(��������)
	
	public static void sortAscending(int[] mr) {
		for (int i=0; i<mr.length-1;i++) {
			for(int k=i+1;k<mr.length;k++) {
				if(mr[i]>mr[k]) {
					int im = mr[i];
					mr[i] = mr[k];
					mr[k] = im;
				}
			}
		}
		
	}
	//�������� ����(��������)
	public static void sortDescending(int[] mr) {
			for (int i=0; i<mr.length;i++) {
				for(int k=i+1;k<mr.length;k++) {
					if(mr[i]<mr[k]) {
						int im = mr[i];
						mr[i] = mr[k];
						mr[k] = im;
					}
				}
			}
		
		
		
		
	}

}
