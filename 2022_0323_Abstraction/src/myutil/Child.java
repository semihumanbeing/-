package myutil;

public class Child extends Parent {
	
	
	// method Override(������)
	// �θ��� �޼��带 �ڽ��� �ٽ� ������ �޼���
	
	@Override // <- JVM�� ���� �ּ�
	public void sub() {
		// TODO Auto-generated method stub
		//super.sub();
		System.out.println("--child:sub()--");
	
	}

}
