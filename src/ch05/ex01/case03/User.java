package ch05.ex01.case03;

public class User {
	private String name;	// encapsulation - ĸ��ȭ)�����̺� ��������� �غ�
	private int age;
	// ��Ŭ�� -> source -> generate getter and setter(�ڵ� get set ����)
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
	

	//method�� �̸��� ���簡 ��Ģ
	
	/*
	// setter
	public void setName(String name){this.name = name;}
	public void setAge(int age) {this.age = age; }
		
	// getter
	public String getName(){ return this.name;	}
	public int getAge(){ return this.age; }
	*/
	
}

