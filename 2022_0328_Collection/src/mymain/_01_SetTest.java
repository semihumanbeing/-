package mymain;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class _01_SetTest {

	// Set - �������� ����Ǵ� �ڷᱸ��
	// - ���ϰ� ������ ���� �ʴ´�.
	// HashSet - �������� ���
	// TreeSet - ���ĵǾ� ���

	public static void main(String[] args) {
		Set set = new HashSet();

		set.add(10);
		set.add(10.5);
		set.add(true);
		set.add("aaa");

		// ������ ���� ��µȴ�

		Set<Integer> set2 = new TreeSet<Integer>();
		set2.add(10);
		set2.add(5);
		set2.add(9);
		set2.add(2);

		System.out.println(set2);

		Set<String> set3 = new HashSet<String>();
		set3.add("���");
		set3.add("����");
		set3.add("����");
		set3.add("����");

		// ��������
		for (String fruit : set3) {
			System.out.println(fruit);
		}
		// Ilterator(�ݺ���)
		Iterator<String> it = set3.iterator();
		System.out.println("--�� ��� ����--");
		while (it.hasNext()) {
			String fruit = it.next(); // ���� �����´�
			System.out.println(fruit);
		}
		
		// �ζǹ�ȣ ����
		
		Random random = new Random();
		int n = 6;
		Set<Integer> lotto = new TreeSet<Integer>();
		while(n>0) {
			int number = random.nextInt(46);
			if(lotto.add(number)==false) {
				continue;
			}
			n--;

		}
		
		System.out.println(lotto);
		
		//collection -> array
		Integer[] lottoArray = new Integer[lotto.size()];
		lotto.toArray(lottoArray);
		
		for(int i=0; i<lottoArray.length;i++) {
			System.out.printf("%d - %d\n",i, lottoArray[i]);
		}

	}

}
