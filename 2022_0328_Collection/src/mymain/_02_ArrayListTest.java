package mymain;

import java.util.ArrayList;
import java.util.List;

public class _02_ArrayListTest {
	public static void main(String[] args) {
		// ������ �ִ� ������ ����
		// ���� �迭
		
		List<String> a = new ArrayList<String>();
		
		a.add("seoul");
		a.add("busan");
		a.add("incheon");
		
		System.out.println("city list");
		
		for(String city : a) {
			System.out.println(city);
		}
		a.remove(1);
		for(String city : a) {
			System.out.println(city);
		}
		
		
		System.out.println("--index--");
		
		for(int i =0; i<a.size();i++) {
			String b = a.get(i);
			System.out.println(b);
		}
		
		
	}
}
