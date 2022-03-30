package vo;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/*
VO (Value Object) : ���� ó���ϴ� ��ü
1. � �����͸� ���� �����ϴ� ��ü
2. getters / setters�� �����س����Ѵ�.
cf) DTO, TO : Data Transfer Object (������ ���� ��ü)
*/

public class PersonVo3 implements Externalizable{
	
	private String name;
	transient private int age; // �ش��ʵ�� ����ȭ���� ���ܵȴ�.
	private String address;
	
	
	// overload�� �����ڰ� ���� ��� �ݵ�� �⺻ �����ڵ� ������ �Ѵ�.
	public PersonVo3() {
	}
	
	public PersonVo3(String name, int age, String address) {
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

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(name); // �̷��� ����ȭ�� �ȴ�, �� ���� ������ ��ġ�ؾ��Ѵ�.
		out.writeInt(age);
		
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		name = (String) in.readObject();
		age = in.readInt();
		
	}

}
