package mymain.echo;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class EchoClient {

	public static void main(String[] args) throws Exception {
		
		//������ ���� ����� ������ Ŭ���̾�Ʈ ������ ����Ǿ���Ѵ�.
		// 1. ���ӿ�û local host <- ����IP
		Socket client = new Socket("localhost", 7000);
		System.out.println("Ŭ���̾�Ʈ ���Ἲ��");
		
		// 2. ���� ���� ��Ʈ���� ���´� 
		OutputStream output = client.getOutputStream();//����������
		InputStream input = client.getInputStream();//�����ͼ���
		
		// 3. �޽��� ���� -> ���� 4.������
		String message = "hehe";
		// String���� Byte�� ��ȯ
		output.write(message.getBytes());
		
		// 4. �������� ���۵� ������ ����
		byte[] buffer = new byte[100];
		int length = input.read(buffer);
		String receivedMessage = new String(buffer,0,length);
		
		System.out.printf("Ŭ���̾�Ʈ ���ڸ޽���: %s", receivedMessage);
		
		

	}

}
