package mymain;

class MyRunnable3 implements Runnable{
	
	int money = 10000;
	
	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		
		while(true) {
			synchronized(this) {
				if(money>1000)
				notify();
				money -=1000;
				System.out.printf("%s ���� (%d��) \n",name,money);
				try {
					wait();
					//�߰��� �ڿ��� ���ܹ����� �������°� �Ǿ� ���α׷��� ��������ʴ´�.
				} catch(InterruptedException e) {
					e.printStackTrace();
				}
				
			}//while
			
				
			}
	}//run
	
}
public class _06_ThreadTest3_DeadLock {
	
	
	public static void main(String[] args) {
		Runnable runnable = new MyRunnable3();
		
		Thread t1 = new Thread(runnable,"����");
		Thread t2 = new Thread(runnable,"�ƿ�");
		
		t1.start();
		t2.start();
		
	}

}
