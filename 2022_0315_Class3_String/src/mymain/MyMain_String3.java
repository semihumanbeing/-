package mymain;

public class MyMain_String3 {
	public static void main(String[] args) {
		
		int count = 0;
		
		//���� �޸� ����
		String msg = ++count + "little," + ++count + "little," + ++count + "little";
		
		System.out.println(msg);
		System.out.println(msg.length());
		
		//�ذ���: StringBuffer �̿��ϱ�
		StringBuffer sb = new StringBuffer(40); // StringBuffer �� 40�� ���ڸ� ���� �� �ִ� ����Ȯ��
		count = 0;
		
		sb.append(++count);
		sb.append("little");
		sb.append(++count);
		sb.append("little");
		
		String msg1 = sb.toString();
		
		System.out.println(msg1);
		
	}

}
