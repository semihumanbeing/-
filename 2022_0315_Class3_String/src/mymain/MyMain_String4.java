package mymain;

public class MyMain_String4 {

	public static void main(String[] args) {
		// ���ڿ� ���
		String socialSecurityNubmer = "960312-2222222";
		
		// ���ڿ��� ���� ���ϱ�
		int length= socialSecurityNubmer.length();
		System.out.printf("�� ����: %d",length);
		System.out.println();
		
		// ���ڿ� �߿��� ����(char) 1�� �����ϱ�
		char gender = socialSecurityNubmer.charAt(7);
		System.out.println(gender);
		if(gender - '0'%2 ==1) {
			System.out.println("����");
		} else
			System.out.println("����");
		
		
		String strYear = socialSecurityNubmer.substring(0,2);
		System.out.println(strYear);
		String strMonth = socialSecurityNubmer.substring(2,4);
		System.out.println(strMonth);
		String strDate = socialSecurityNubmer.substring(4,6);
		System.out.println(strDate);

		// year = "80" �� ���ڿ��� ���´�.
		// ���ڿ� -> ���� : integer.parseInt("���������ڿ�")
		// ���ڿ� -> �Ǽ� : double.parseDouble("���������ڿ�")
		// ���� -> ���� : '4' = 4
		
		int year = Integer.parseInt(strYear);
		if(gender =='1' || gender == '2'|| gender == '5'|| gender =='6') {
			year = year + 1900;
		} else if(gender =='3' || gender == '4'|| gender == '7'|| gender =='8') {
			year = year + 2000;
		} else year = year + 1800;
		
		System.out.println(year);
		
		            //012345678901234567890
		String str = "I am tom You are Jane";
		// 'a'�� ��ġ�� �˰� ���� ��
		int index = str.indexOf('a');
		System.out.println(index);
		
		// 'tom'�� ��ġ
		int index2 = str.indexOf("tom");
		System.out.println(index2);
		
		// 'a'�� ��ġ�� �ڿ������� �˻�
		int index3 = str.lastIndexOf('a');
		System.out.println(index3);
		
		// ���ڿ� �߿� 'Jane' �̶�� �ܾ �ִ��� Ȯ��
		boolean bOk = str.contains("Jane");
		System.out.println(bOk);
		
		String msg = "[ä��] #�浿 #�ȳ��ϼ���";
		bOk = msg.startsWith("[ä��]");
		System.out.println(bOk);
		
		
		

	}

}
