package mymain.input;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class _01_KeyboardInputTest2 {

	public static void main(String[] args) throws IOException {
		int ch;
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		
		System.out.println("�����Ϸ��� ctrl + z");
		
		while(true) {
			// Ű���� ���۷κ��� 1byte�о����
			ch = isr.read();
			
			if(ch ==-1) break;
			System.out.printf("%c",ch);
		}

	}

}
