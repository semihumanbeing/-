package myutil;

public interface BasicCalculation {
	
	// �����׸�: ���, �߻�޼���
	// 1.8���� ���ĺ��ʹ� default method �� ����� ���� �ִ�.
	
	double PI = 3.141592;
	
	public abstract int plus(int a, int b);
	int minus(int a, int b);
	
	// default������ �������� �����Ǹ� �Ҽ� �ִ�.
	int ZERO = 0;
	default int getMinimumNumber() {
		return ZERO;
	}
	

}
