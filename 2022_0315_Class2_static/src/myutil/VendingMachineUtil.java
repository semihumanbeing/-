package myutil;

public class VendingMachineUtil {
	
	
// drink �ܰ� �������	
public static final int COLA = 500;
public static final int CIDER = 600;
public static final int JUICE = 800;
public static final int MILK = 400;

//drink ������ �������
public static final int DRINK_COLA = 1;
public static final int DRINK_CIDER = 2;
public static final int DRINK_JUICE = 3;
public static final int DRINK_MILK = 4;

int money; //�����ݾ�
int drink; //��������

public void insertCoin(int money) {
	this.money = money;
}
public void selectDrink(int drink) {
	this.drink = drink;
}
	
public void displayResult() {
	
	
	int price = 0;
	if (money>=COLA||money>=CIDER||money>=JUICE|| money>= MILK) {
		
		if(drink == DRINK_COLA) {
			price = COLA;
			System.out.printf("�����ݾ�: %d ��������: �ݶ�(%d), �Ž����� %d",money,COLA,(money-COLA));
		} else if (drink == DRINK_CIDER) {
			price = CIDER;
			System.out.printf("�����ݾ�: %d ��������: ���̴�(%d), �Ž����� %d",money,CIDER,(money-CIDER));
		} else if (drink == DRINK_JUICE) {
			price = JUICE;
			System.out.printf("�����ݾ�: %d ��������: �꽺(%d), �Ž����� %d",money,JUICE,(money-JUICE));
		} else if (drink == DRINK_MILK) {
			price = MILK;
			System.out.printf("�����ݾ�: %d ��������: ����(%d), �Ž����� %d",money,MILK,(money-MILK));
		} 
	} else {
		System.out.print("�ܾ��� �����մϴ�.");
	}
	
		
}
	
	

}
