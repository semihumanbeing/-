
public class _08_TernaryOperator {

	public static void main(String[] args) {
		/*
		 * ���׿�����: 
		 * ����: ���� ? ��1(��) : ��2(����)
		 */
		// �� �� �߿� ū �� ���ϱ�
		int a = 5;
		int b = 4;
		int c;
		
		c = (a > b) ? a : b;
		
		System.out.printf("%d, %d �߿� ū ���� %d �Դϴ�\n", a, b, c);
		
		
		// if else ������ �����
		
		if (a > b) {
			c = a;
			System.out.printf("%d, %d �߿� ū ���� %d �Դϴ�\n", a, b, c);
		} else {
			c = b;
			System.out.printf("%d, %d �߿� ū ���� %d �Դϴ�\n", a, b, c);
		}
			
		
		System.out.println();
		
		int n = -10;
		int m;
		
		m = (n<0) ? -n : n;
		
		System.out.printf("%d �� ���밪�� %d\n", n, m);
		
		// if else ������ �����
		
		if (n<0) {
			m = -n;
			System.out.printf("%d �� ���밪�� %d\n", n, m);
		}

	}

}
