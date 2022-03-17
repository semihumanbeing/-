package myutil;

import java.util.Calendar;

/*
 1. ����⵵ �־�����
    :����   : getAge() 
    :��    : getT()
    :60���� : getGanji()
 */


public class Myinfo {
	
	public int getAge(int year) {
		
		//���� �ý��� ��¥���ϱ�
		Calendar c = Calendar.getInstance();
		
		//����⵵ ���ϱ�
		int currentYear = c.get(Calendar.YEAR);
		
		
		//����: ����⵵ - ����⵵ + 1
		int age = currentYear-year+1;
		return age;
		
		
	}
	   //4 5 6  7  8 9 10 11 0 1 2 3 
	   //�� �� �� �� �� �� �� �� �� �� �� ��
	   //�� �� �� �� �� �� �� �� �� �� �� ��
	 public String getT(int year) {
		  int tIndex = year%12;
		  
		  switch(tIndex) {
		  case 0 : return "������";
		  case 1 : return "��";
		  case 2 : return "��";
		  case 3 : return "����";
		  case 4 : return "��";
		  case 5 : return "��";
		  case 6 : return "ȣ����";
		  case 7 : return "�䳢";
		  case 8 : return "��";
		  case 9 : return "��";
		  case 10 : return "��";
		  
		  }
		  return "��";	  
	 }
	  		
	   // 10��
	   // 4 5  6 7  8 9 0  1 2  3
	   // �� �� �� �� �� �� �� �� �� ��
	   // 12��
	   // 4 5  6  7 8 9 10 11 0 1 2  3  
	   // �� �� �� �� �� �� �� �� �� �� �� ��
	 public String getGanji(int year) {
		 
	   //2020
	   //2022%10 -> 2
	   //2022%12 -> 6
		  String gan = "";
		  String ji = "";
		  int ganIndex = year%10;
		  int jiIndex = year%12;
		  
		  switch(ganIndex) {
		  case 0 : gan = "��"; break;
		  case 1 : gan = "��"; break;
		  case 2 : gan = "��"; break;
		  case 3 : gan = "��"; break;
		  case 4 : gan = "��"; break;
		  case 5 : gan = "��"; break;
		  case 6 : gan = "��"; break;
		  case 7 : gan = "��"; break;
		  case 8 : gan = "��"; break;
		  }
		  
		  switch(jiIndex) {
		  case 0 : ji = "��"; break;
		  case 1 : ji = "��"; break;
		  case 2 : ji = "��"; break;
		  case 3 : ji = "��"; break;
		  case 4 : ji = "��"; break;
		  case 5 : ji = "��"; break;
		  case 6 : ji = "��"; break;
		  case 7 : ji = "��"; break;
		  case 8 : ji = "��"; break;
		  case 9 : ji = "��"; break;
		  case 10 : ji = "��"; break;
		  case 11 : ji = "��"; break;
		  
		  }
		  
		 
		return gan + ji + "��"; 		  
		  }
	 
	 
	 
	 public double getBMI(double height, double weight) {
		double heightM = height / 100.0;
		double bmi = weight / (heightM * heightM);
		
		 return bmi;
	 }
	 
	 public String getBMIState(double bmi) {
		 
		 	String state = "";
		 	
			if(bmi < 20) {
				state = "��ü��";
			} else if (bmi > 20 && bmi < 24) {
				state = "����";
			} else if (bmi > 25 && bmi < 29) {
				state = "��ü��";
			} else if (bmi > 30) {
				state = "��";
			}
		 return state;
	 }
		 	 
}
