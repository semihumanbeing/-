package mymain;

public class _exam09_10 {

	public static void main(String[] args) {
		//9������
		
		int n = 8;
		int sum = 1;
		for(int m = n;m>0;m--)
		{
			sum = sum * m;
			if(n == 0)
			{
				sum = 1;
			}
			
		}
		System.out.printf("%d! = %d",n,sum);
		
		System.out.println();
		
		// 10������
		
		int ten;
		int total = 1;
		for (ten=1;ten<=10;ten++)
		{
			if(ten%2==0) 
			{
			total = total * ten;	
			}
			
		}
		System.out.printf("1���� 10���� ¦���� ��: %d",total);
		

	}

}
