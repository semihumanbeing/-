package mymain;

public class _06_Continue_1 {

	public static void main(String[] args) {
		
		// continue: ���� ����� �����ϰ� �ݺ����� ���� ��������� �̵��ϱ�
		// continue label: ���� ����� �����ϰ� label ���� �ݺ����� ���� ��������� �̵��ϱ�
		
		int sum = 0;
		for(int i=1;i<=10;i++) {
			if (i%2==0) continue;// ¦���� �ǳʶٱ�
			
			sum = sum + i;
		}
		System.out.printf("10������ Ȧ���� ��: %d",sum);
		
		System.out.println();
		
		//2�� for���� continue label ���̱�
		// label�� �޾Ƶ� ������ �ٷ� �̵��ϱ� ������ ���� k++�� �̵��Ѵ�.
		
		OUT_FOR: //label ���̱�
		for(int k =1;k<=5;k++)	{
		for(int i = 1; i<=5; i++){
			if (k==i) {
				System.out.println();
				continue OUT_FOR;
			}
			System.out.printf("[k:%d, i:%d] ",k,i);
		}
		System.out.println();
	}
	
		
		

	}

}
