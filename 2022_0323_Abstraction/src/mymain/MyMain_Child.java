package mymain;

import myutil.Child;
import myutil.Parent;

public class MyMain_Child {

	public static void main(String[] args) {
		
		Parent p = new Child();
		
		p.sub(10); // parent�� �ִ� �޼��尡 ȣ��ȴ�
		p.sub(); // �� �������� override �� �޼��尡 ȣ��ȴ�.

	}

}
