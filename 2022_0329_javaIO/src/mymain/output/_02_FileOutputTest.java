package mymain.output;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

public class _02_FileOutputTest {

	public static void main(String[] args) throws Exception {
		OutputStream os = new FileOutputStream("a.txt");
		
		os.write(65);
				
		//printstream����
		PrintStream out = new PrintStream(os);
		out.println("������");
		int age = 20;
		String name = "ȫ�浿";
		
		out.printf("�̸� %s ", name);
		out.printf("���� %d ", age);
		
		
				
		
		
		os.close();
	}

}
