package mymain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import vo.PersonVo;

public class _05_ArrayList_CompareTo_Map_OnSearch {
	public static void main(String[] args) {
		Random random = new Random();
		
	List<PersonVo> personList = new ArrayList<PersonVo>();
	Map<String,PersonVo> personMap = new HashMap<String,PersonVo>();
	
	for(int i =0;i<=100;i++) {
		String name = String.format("�浿%03d", i);
		//System.out.println(name);
		int age = random.nextInt(99)+1;
		//System.out.println(age);
		String address = String.format("����� ������ ����%d��",random.nextInt(10)+1);
		
		PersonVo p = new PersonVo(name,age,address);
		// ������ ��ü�� ��̸���Ʈ�� �߰��Ѱ�
		personList.add(p);
		// ������ ��ü�� �ʿ� �߰��ϱ�
		personMap.put(name, p);
		
	}
	
	//System.out.println(personList.size());
	String searchName = "�浿060";
	
	// ArrayList�� ��ü �˻��ϱ�
	int count = 0;
	for(int i = 0; i <personList.size();i++) {
		count++;
		PersonVo p = personList.get(i);
		
		if(searchName.equals(p.getName())) {
			System.out.println(p);
			break;
		}
	}

	System.out.printf("ArrayList�� %s�� �߰��� �� ������ �˻�Ƚ��: %d\n",searchName, count);
	
	
	// Map���� ��ü �˻��ϱ�
	PersonVo p = personMap.get(searchName);
	System.out.println(p);
	

	}
}
