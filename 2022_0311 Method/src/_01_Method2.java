import myutil.MyMath;

public class _01_Method2 {

	public static void main(String[] args) {
		
		// �޼����� �����
		
		MyMath mm = new MyMath();
		// mm = â������
		// ���Ӱ� ������ ��ü�� heap �� �Ҵ�ȴ�
		// ������ ��ü�� �޼��带 �����ϰ��ִ�.
		
		int x = 10, y = 3, z = 13;
		int result;
		
		result = mm.plus(x, y);
		
		System.out.printf("%d + %d = %d\n", x, y, result);
		
		result = mm.minus(x, y);
		
		System.out.printf("%d - %d = %d\n", x, y, result);
		
		result = mm.multiply(x, y);
		
		System.out.printf("%d * %d = %d\n", x, y, result);
		
		result = mm.max(x, y);
		
		System.out.printf("%d �� %d �߿� ū ���� = %d\n", x, y, result);
		
		result = mm.sum(x);
		
		System.out.printf("1~%d ������ �� = %d\n", x, result);
		
		result = mm.max3(x, y, z);
		
		System.out.printf("%d, %d, %d �߿� ū ���� = %d\n", x, y, z, result);
		
		result = mm.hap(x, y);
		
		System.out.printf("%d ������ �� �� %d�� ����� �� = %d\n", x, y, result);
		
		result = (int) mm.pow(x, y);
		
		System.out.printf("%d �� %d�� = %d\n", x, y, result);
		


	}

}
