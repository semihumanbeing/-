package mymain;

import java.util.ArrayList;
import java.util.List;

import vo.PersonVo;

public class _03_ArrayListTest2 {

	public static void main(String[] args) {
		List<PersonVo> personList = new ArrayList<PersonVo>();

		personList.add(new PersonVo("�ϱ浿", 11, "����� ������ ����1��"));
		personList.add(new PersonVo("�̱浿", 21, "����� ������ ����2��"));
		personList.add(new PersonVo("��浿", 31, "����� ������ ����3��"));
		personList.add(new PersonVo("��浿", 41, "����� ������ ����4��"));
		personList.add(new PersonVo("���浿", 51, "����� ������ ����5��"));

		// ù��° ��ü���� ������

		System.out.println("");
		PersonVo person1 = personList.get(0);
		System.out.println(person1);

		System.out.println("÷�� �̿��� ���");
		for (int i = 0; i < personList.size(); i++) {
			PersonVo p = personList.get(i);
			System.out.println(p);
		}

		System.out.println("��������");
		for (PersonVo p : personList) {
			System.out.println(p);
		}

	}

}
