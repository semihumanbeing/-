package mymain;

public class _01_����������ǿ���ó�� {
	// Exception

	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		int res;

		if (b != 0) {// �������� �̸� ����
			res = a / b;
		} else
			System.out.println("0���� ���� �� �����ϴ�");

		String str = null;
		int len = 1;
		if (str != null) { // �������� �̸� ����
			len = str.length();
			
		} else
			System.out.println("str is null");

	}
}
