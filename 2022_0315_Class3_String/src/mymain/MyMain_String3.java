package mymain;

public class MyMain_String3 {
	public static void main(String[] args) {
		
		int count = 0;
		
		// String�� + �� �ø������� ���ο� ��Ʈ���� ��������� ������ ���� �޸� ���� �����ϰԵȴ�.
		String msg = ++count + "little," + ++count + "little," + ++count + "little";
		
		System.out.println(msg);
		
		//�ذ���: StringBuffer �̿��ϱ�
		StringBuffer sb = new StringBuffer(40); // StringBuffer �� 40�� ���ڸ� ���� �� �ִ� ����Ȯ��
		count = 0;
		
		sb.append(++count);
		sb.append(" little ");
		sb.append(++count);
		sb.append(" little ");
		
		String msg1 = sb.toString(); // StringBuffer -> String �����ϱ�
		
		System.out.println(msg1);
		
		// �ذ��� 2: Formatter �̿��ϱ�
		count = 0;
		
		String msg2 = String.format("%d little, %d little, %dlittle", ++count, ++count, ++count);
		System.out.println(msg2);
		
		
		
	}

}
