package mymain;

public class MyMain_String2 {

	public static void main(String[] args) {
		
		// �Һ��� Ư¡
		
		String str = "abc";
		
		String str1 = str.toUpperCase();
		
		System.out.printf("%s -> %s\n", str, str1);
		// str1�� str�� �̿��ؼ� ���ο� ��ü�� ���� ������ str �� ���� �ٲ۰��� �ƴϴ�.
		
		String msg = "lol babo";
		msg = msg.replaceAll("babo", "****");
		
		System.out.println(msg);
		

	}

}
