package mymain;

public class _04_While_3_Keyboard {

	public static void main(String[] args) throws Exception {
		//Ű���� ǥ����ġ��: System.in
		
		int ch;
		
		int count = 0;
		int uppercase = 0;
		int lowercase = 0;
		int countNumber = 0;
		int countWhite = 0;
		int countElse = 0;
		
		
		System.out.println("���� �Է��ϼ���: \n(����: ctrl+z)");
		while(true) {
			
			ch = System.in.read();
			
			if(ch==-1) break;
			if(ch >= 'A' && ch <='Z') {
				uppercase++;
			} else if(ch >= 'a' && ch <='z') {
				lowercase++;
			} else if(ch >= '0' && ch <='9') {
				countNumber++;
			} else if(ch == '\n' || ch == '\r' || ch =='\t' || ch == ' ') {
				countWhite++;
			} else {
				countElse++;
			}
			
			
			System.out.printf("%c",ch);
			count++;
		} 
		System.out.printf("�Է��� ���ڼ�: %d\n", count);
		System.out.printf("�Է��� �빮�� ��: %d\n", uppercase);
		System.out.printf("�Է��� �ҹ��� ��: %d\n", lowercase);
		System.out.printf("�Է��� ���� ��: %d\n", countNumber);
		System.out.printf("�Է��� ���� ��: %d\n", countWhite);
		System.out.printf("�Է��� ��Ÿ ��: %d\n", countElse);
		System.out.println("--end--");
	}

}
