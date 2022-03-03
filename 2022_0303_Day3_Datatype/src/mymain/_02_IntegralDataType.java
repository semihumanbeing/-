package mymain;

public class _02_IntegralDataType {

	public static void main(String[] args) {
		/*
		 ������ �ڷ���: byte, short, int long -> �⺻��: int
		 */
		System.out.println(1);
		
		//100�� ���� �� ���� �� ���
		System.out.printf("10����: %d\n", 100);
		System.out.printf("16����: %x\n", 100);
		System.out.printf("8����: %o\n", 100);
		
		//�������� �� -> 10������ ���
		System.out.printf("%d\n", 0x64);
		System.out.printf("%d\n", 0144);
		System.out.printf("%d\n", 0xff);
		
		//�ڸ��� �����ؼ� ���
		int n = 123;
		
		// %md : m <- ����ڸ���
		System.out.printf("[%10d]\n", n);
		
		// %0md : m <- ����ڸ��� 0 <- �� ������ 0���� ä����
		System.out.printf("[%013d]\n", n);
		
		// %-md : -m <- ����ڸ���, ���� ��ȣ�� ���� left 
		System.out.printf("[%-10d]\n", n);

	}

}
