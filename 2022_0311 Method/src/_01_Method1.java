
public class _01_Method1 {
	
	/*
	 �޼��� ȣ�� ��Ŀ� ���� �з�
	 1. call by name      : �̸��� ȣ��
	 2. call by value     : �̸� + ���� ȣ��
	 3. call by reference : �̸� + ����(����(�ּ�)����) ȣ��
	 */
	
	public static void title() {
		System.out.println("-----�޼��忬��-----");
		//���ϰ��� ������ void �޼��带 ����
		return;
	}
	
	public static int plus(int a, int b) {
							// int a = x, int b = y (�޼����� ���ڴ� ȣ�� �� �����ȴ�)
		int c = a+ b;
		return c;
	}

	public static void main(String[] args) {
		
		title();
		
		int x = 10, y = 5, res;
		res = plus(x,y);
		System.out.printf("%d + %d = %d",x, y, res);
		

	}

}
