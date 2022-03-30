package mymain.serial;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

import vo.PersonVo;
import vo.PersonVo3;

public class _01_SerializationSelected2 {

	public static void main(String[] args) throws Exception {

		PersonVo3 p = new PersonVo3("ȫ�浿", 20, "����� ������ ������");

		OutputStream os = new FileOutputStream("person3.dat"); // ����ȭ ó����ü�� ����
		ObjectOutputStream oos = new ObjectOutputStream(os);

		oos.writeObject(p);

		oos.close();
		os.close();

		// ������ȭ -> �б�(����)
		InputStream is = new FileInputStream("person3.dat");
		// ������ȭ ��ü�� ����
		ObjectInputStream ois = new ObjectInputStream(is);
		// ���ϳ����� �о�ͼ� ����(������ȭ)
		PersonVo3 p1 = (PersonVo3) ois.readObject();
		System.out.println(p1);

		// ����ȭ(���� ����)

		ois.close();
		is.close();
	}

}
