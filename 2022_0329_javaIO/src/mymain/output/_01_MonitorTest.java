package mymain.output;

import java.io.OutputStream;

public class _01_MonitorTest {

	public static void main(String[] args) throws Exception {
		OutputStream os = System.out;
		os.write(65);
		String msg = "�ȳ�";
		byte [] msgByte = msg.getBytes();
		os.write(msgByte);
		
		int n = 123;
		String s = String.valueOf(n);
		byte[] nbyte = s.getBytes();
		os.write(nbyte);
		
		os.flush(); // ���buffer ������ ����ͷ� ������

	}

}
