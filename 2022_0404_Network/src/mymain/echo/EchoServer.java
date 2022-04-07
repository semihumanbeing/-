package mymain.echo;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {

	public static void main(String[] args) throws Exception {
		//���� ������ ����� ����ϰ� �ִ� ������ ������ �޽����� �������·� ����
		
		// 1. ���� ���� ����
		ServerSocket server = new ServerSocket(7000);
		
		// 2. ���Ӵ��
		System.out.println("���� ���� �����");
		Socket child = server.accept();
		
		// 3. �ۼ��� ����� ��Ʈ��
		OutputStream output = child.getOutputStream();//����������
		InputStream input = child.getInputStream();//�����ͼ���
		
		// 4. ������ ����
		byte[] buffer = new byte[100];
		int length = input.read(buffer); // ����޼���
		// length - ���ŵ� ������ ����
		// ���� Ŭ���̾�Ʈ���� �����Ͱ� ������ ������ �����Ͱ� ���ö����� ��ٸ���
		//System.out.println(length);
		// buffer�� ����� ���� �������� ���̸� �����Ͽ� String���� ��ȯ�Ѵ�.
		String readData = new String(buffer,0,length);
		System.out.printf("���ŵ�����: %s\n", readData);
		
		// 5. Ŭ���̾�Ʈ���� ������ -> Ŭ���̾�Ʈ 4������
		output.write(readData.getBytes());
		
	}

}
