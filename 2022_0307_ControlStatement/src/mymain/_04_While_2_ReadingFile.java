package mymain;

import java.io.FileReader;

public class _04_While_2_ReadingFile{

	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader("a.txt"); //����
		
		int ch;
		while(true) {
			ch = fr.read();//���� 1�� �о����
			if(ch == -1)break; // -1�� ������ ��(EOF)�� �ǹ��Ѵ�. 
			
			System.out.printf("%c",ch);
			
		//	Thread.sleep(100);
		}
		
		fr.close();//�ݱ�

	}

}
