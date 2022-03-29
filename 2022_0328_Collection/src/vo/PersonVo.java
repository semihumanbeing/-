package vo;

import java.io.Serializable;

/*
VO (Value Object) : ���� ó���ϴ� ��ü
1. � �����͸� ���� �����ϴ� ��ü
2. getters / setters�� �����س����Ѵ�.
cf) DTO, TO : Data Transfer Object (������ ���� ��ü)
*/

public class PersonVo implements Serializable {
	
	private String name;
	private int age;
	private String address;
	
	
	// overload�� �����ڰ� ���� ��� �ݵ�� �⺻ �����ڵ� ������ �Ѵ�.
	public PersonVo() {
	}
	
	public PersonVo(String name, int age, String address) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		String str = String.format("%s-%d-%s", name, age, address);
		return str;
	}

}
