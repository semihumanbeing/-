package mymain;

public class _exam03 {

	public static void main(String[] args) throws Exception {
		// 3������
		System.out.println("�ƹ� Ű�� �Է��ϼ���: ");
		int ch = System.in.read();
		
		if ((ch >= 65 && ch <= 90)|| (ch >= 97 && ch <= 122)) 
		{
			System.out.println("���ĺ��Դϴ�");
		}
		else if (ch == '\n' || ch == '\t'|| ch == '\r'|| ch == ' ')
		{
			System.out.println("�����Դϴ�");
		}
		else if (ch >= '0' && ch <= '9') 
		{
			System.out.println("�����Դϴ�");
		}

	}

}
