package myutil;

public class AdvanceCalculation extends BasicCalculation {

	// n������ ��
	public int sum(int n) {
		int sumnum = 0;
		for (int i = 0; i <= n; i++) {
			sumnum = super.plus(sumnum, i);
			// superŬ������ ����� ���
		}
		return sumnum;
	}

	// n�� m��
	public int pow(int n, int m) {
		int result = 1;
		for (int i = 0; i < m; i++) {
			result = result * n;
		}
		return result;
	}
}
