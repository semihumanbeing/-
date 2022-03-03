package mymain;

public class _03_FloatingPointDataType {

	public static void main(String[] args) {
		/*
		 �Ǽ��� �ڷ���: float double(�⺻��) <- �Ҽ����� �ִ� ��
		 ���: 1.0 0.   <-double
		      1.0F     <- float
		      1.0e+2   <- ���� ���� 
		 ��¼���: %f    <- �Ҽ��� ���� 6�ڸ�
		         %e    <- �Ҽ��� ���� 6�ڸ�
		         %g    <- �ڸ����� ���� ������ ���
		              

		 */
		System.out.println(1.0); // <- double
		System.out.println(1.0F); // <- float
		
		double d = 12.345678912;
		
		System.out.printf("%f\n", d);
		System.out.printf("%e\n", d);
		System.out.printf("%g\n", d);
		
		// %m.nf : m(��ü�ڸ���) n(�Ҽ��������ڸ���)
		// %0m.nf : 0(���� �ڸ��� 0���� ä���)
		// %-m.nf : -(left ����)
		
		double pi = Math.PI;
		System.out.println(pi);
		System.out.printf("%f\n", pi);
		System.out.printf("[%10f]\n", pi);
		System.out.printf("[%10.2f]\n", pi);
		System.out.printf("[%010.2f]\n", pi);
		System.out.printf("[%-10.2f]\n", pi);
		

	}

}
