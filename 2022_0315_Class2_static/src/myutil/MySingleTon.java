package myutil;

public class MySingleTon {
	
	//single-ton pattern
	static MySingleTon single = null;
	
	public static MySingleTon getInstance() {
		
		if (single == null)
			single = new MySingleTon();
		return single;
		
	}
	
	// �ܺο��� ������ ���ϰ� �Ѵ�.
	private MySingleTon() {
		System.out.println("--MySingleTon()--");
	}
	
	public void push_nail() {
		System.out.println("--���ڱ�--");
	}

}
