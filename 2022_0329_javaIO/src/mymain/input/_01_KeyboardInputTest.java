package mymain.input;

import java.io.IOException;
import java.io.InputStream;

public class _01_KeyboardInputTest {

	public static void main(String[] args) throws IOException {
		int ch;
		InputStream is = System.in;
		
		System.out.println("�����Ϸ��� ctrl + z");
		
		while(true) {
			// Ű���� ���۷κ��� 1byte�о����
			ch = is.read();
			
			if(ch ==-1) break;
			System.out.printf("%c",ch);
		}

	}

}
