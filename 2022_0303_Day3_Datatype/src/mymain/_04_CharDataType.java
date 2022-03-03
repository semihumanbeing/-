package mymain;

public class _04_CharDataType {

	/*
	 ������ �ڷ��� : char (2byte)
	 ���: 'A' '��' '��'
	 ��¼���: %c
	 
	 ASCII ��Ź����ڵ�: 0~126
	 0~31: ��� �� �����
	 32~126: Ű���� �� ���� �ڵ�
	 'A' : 65
	 'a' : 97 (��-> �빮�� ����: 32)
	 '0' : 48
	 '1' : 49
	 
	 \r: carrige return(home)
	 \n: new line(enter)
	 \t: tap key
	 \a: alert(�����)
	 \f: ���� �忡 ����ϱ�
	 \b: caret�� ��ġ�� �������� (<- Ű)
	 
	 */
	
	public static void main(String[] args) {
		System.out.printf("%c\n", 'a');
		System.out.printf("%c\n", 65);
		System.out.printf("%c\n", 66);
		System.out.printf("%d\n", (int)'��');
		System.out.printf("%c\n", 54620);
		System.out.printf("A\n%c\n",66);
		System.out.println("A\tB\tC");

	}

}
