package mymain;

import java.util.ArrayList;

import myutil.MyArrayList;

public class _05_����ó��throws {
	
	public static void main(String[] args) throws Exception {
	//ArrayList(�����迭)
	ArrayList list = new ArrayList();
	System.out.printf("list's size = %d", list.size());
	
	list.add(10);
	System.out.printf("list's size = %d", list.size());
	list.add(30);
	System.out.printf("list's size = %d", list.size());
	list.add(20);
	System.out.printf("list's size = %d", list.size());
	
	int n = (int) list.get(1);
	System.out.println(n);
	
	//��ü �������о����
	for(int i =0;i<list.size();i++) {
		int m = (int) list.get(i);
		System.out.printf("index ->%d : %d\n",i,m);
	}
	list.remove(1);
	System.out.println(list.size());
	//---------------------------------------------------------------
	
	MyArrayList list1 = new MyArrayList();
	System.out.println(list1.size());
	
	list1.add(10);
	System.out.println(list1.size());

	list1.add(20);
	System.out.println(list1.size());

	list1.add(30);
	System.out.println(list1.size());
	
	try {
		//index�� ��ü���� ������
		int index = 2;
		int n1 = (int) list1.get(index);
		System.out.println(n1);
		
		System.out.println("������");
		for(int i =0; i<list1.size();i++) {
			int m1 = (int) list1.get(i);
			System.out.printf("index %d -> %d\n", i, m1);
		}
		System.out.println("������");
		index = 1;//����
		list1.remove(index);
		
		for(int i =0; i<list1.size();i++) {
			int m1 = (int) list1.get(i);
			System.out.printf("index %d -> %d\n", i, m1);
		}
		
	}catch(Exception e) {
		e.printStackTrace();
	}
	
	
	}
}
