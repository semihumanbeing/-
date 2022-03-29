package mymain.input;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class _03_NetworkInputTest {

	public static void main(String[] args) throws Exception {
		String strUrl = "https://www.naver.com/";
		
		URL url = new URL(strUrl);
		// ���� ����� �����κ��� �����͸� �о�� �� �ִ� InputStream
		InputStream is = url.openStream(); 
		// charStream���� ���;����
		InputStreamReader isr = new InputStreamReader(is,"utf-8");
		// bufferedReader ����(���پ� ���ŵǰ� ���ʹ� �����ϱ⶧���� println�� ����ؾ��Ѵ�.)
		BufferedReader br = new BufferedReader(isr);
		
		int ch;
		//int count=1;
		while(true) {
			/*
			 * count ++; if(count>1000)break;
			 */
			//ch = isr.read();
			//if(ch ==-1) break;
			//System.out.printf("%c", ch);
			
			String readStr = br.readLine();
			if(readStr == null) break;
			System.out.println(readStr);
			
		}
	}

}
