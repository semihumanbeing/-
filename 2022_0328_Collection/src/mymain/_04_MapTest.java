package mymain;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class _04_MapTest {
	
	/*
	 * Map 
	 * �� HashMap - ���ĵ����ʴ� �� 
	 * �� TreeMap - ���ĵǴ� �� 
	 */
	
	public static void main(String[] args) {
		Map<Integer, String> telMap = new HashMap<Integer,String>();
		
		telMap.put(1, "010-111-1234");
		telMap.put(2, "010-222-1234");
		telMap.put(3, "010-333-1234");
		telMap.put(4, "010-444-1234");
		telMap.put(5, "010-555-1234");
		
		int shortNumber = 1;
		String tel = telMap.get(shortNumber);
		System.out.printf("�����ȣ %d / %s\n", shortNumber,tel);
		
		Set<Integer> keySet = telMap.keySet();
		System.out.println("�� ��ü ������ ���");
		for(Integer key:keySet) {
			// key �� �ش��ϴ� �� ������
			String tel1 = telMap.get(key);
			System.out.printf("�����ȣ: %d / %s\n", key, tel1);
		}
		
	}
}
