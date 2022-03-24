package mymain;

import java.util.ArrayList;

import myutil.AdvanceCalculation;
import myutil.BasicCalculation;

public class MyMainCalculator {
	
	static void useBasicCalculation(BasicCalculation bc) {
		// up-casting �߻��Ͽ� basicCalculation �� ����� ����� �� �ִ�.
		int x = 10, y = 5, res;
		res = bc.multiply(x, y);
		System.out.printf("%d * %d = %d", x,y,res);
		
		
	}
	
	static void useObject (Object ob) {
		// up-casting �߻��Ͽ� obejct ��ɸ� ����� �� �ִ�.
		int x = 10, res;
		AdvanceCalculation ac = (AdvanceCalculation) ob; // casting�� ���
		res = ac.sum(x);
		
		System.out.printf("%d������ �� = %d",x,res);
		
		
	}

	public static void main(String[] args) {
		AdvanceCalculation ac = new AdvanceCalculation();

		int a = 10, b = 3, res;
		res = ac.plus(a, b);
		System.out.printf("%d + %d = %d", a, b, res);
		
		System.out.println();
		
		res = ac.sum(a);
		System.out.printf("%d������ ��: %d",a,res);
		
		System.out.println();
		
		// collection : ���������ü <- �ڹ��� ��� ��ü ����
		ArrayList list = new ArrayList(); 
		list.add("Java String Object");
		list.add(10); 
		list.add(true);
		list.add(10.5);
		
		// Wrapper class
		// Integer int -> Integer
		// Integer nOb = 10; 10 -> new Integer(10)
		// Auto-Boxing 
		Integer nOb = 10; //Integer.valueOf(10);  // new Integer(10);
		// Auto-Unboxing
		int n = nOb;
		
		System.out.println(n);
		
		
		Object[] array = {"String", 10, true, 10.5};
		
		String s = (String) array[0];
		System.out.println(s);

	}
	
	
	
	

}
