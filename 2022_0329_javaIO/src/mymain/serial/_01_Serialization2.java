package mymain.serial;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import vo.PersonVo;

public class _01_Serialization2 {

	public static void main(String[] args) throws Exception {

		
		List<PersonVo> pList = new ArrayList<PersonVo>();
		pList.add(new PersonVo("�ϱ浿", 21, "����� ������ ����1��"));
		pList.add(new PersonVo("�̱浿", 22, "����� ������ ����2��"));
		pList.add(new PersonVo("��浿", 23, "����� ������ ����3��"));
		pList.add(new PersonVo("��浿", 24, "����� ������ ����4��"));
		pList.add(new PersonVo("���浿", 25, "����� ������ ����55��"));
		
		
		PersonVo[] pArray = { 
				new PersonVo("�ϱ浿", 21, "����� ������ ����1��"), new PersonVo("�̱浿", 22, "����� ������ ����2��"),
				new PersonVo("��浿", 23, "����� ������ ����3��"), new PersonVo("��浿", 24, "����� ������ ����4��"),
				new PersonVo("���浿", 25, "����� ������ ����5��") };

		OutputStream os = new FileOutputStream("personList.dat"); // ����ȭ ó����ü�� ����
		ObjectOutputStream oos = new ObjectOutputStream(os);

		oos.writeObject(pList);

		oos.close();
		os.close();

		// ������ȭ -> �б�(����)
		InputStream is = new FileInputStream("personList.dat");
		// ������ȭ ��ü�� ����
		ObjectInputStream ois = new ObjectInputStream(is);
		// ���ϳ����� �о�ͼ� ����(������ȭ)
		
		@SuppressWarnings("unchecked")
		List<PersonVo> pList1 = (List<PersonVo>) ois.readObject(); 
		for (PersonVo p : pList1) {
		System.out.println(p); }
		 

		// ����ȭ(���� ����)

		ois.close();
		is.close();

	}

}
