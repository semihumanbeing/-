package mymain;

public class _02_����ó����� {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 1;
		int res;
		int [] ar = new int[5];
		
		String str = null;
		int len = 0;
		
		
		//java ���ο��� ���ܰ� �߻��ϸ� ���ܸ� ������.
		int index = 10;
		
		if (index<0||index>=ar.length) throw new ArrayIndexOutOfBoundsException("�迭���� ������ϴ�");
		ar[10] = 100;
		
		//�Ϲ����� ����ó������
		try {
			// �����ؾ� �� �ڵ�
			if(b==0)throw new ArithmeticException();
			res = a/b;
			len = str.length();
			ar[10]=100;
			
		} catch (ArithmeticException e) {
			//����Ǵ� ����ó��
			e.printStackTrace();
			System.out.println("0���� ������ �����ϴ�");
			
		} catch (NullPointerException e) {
			System.out.println("str is null");
		}

	}

}
