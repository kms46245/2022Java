package ch05.ex01.case03;

public class User {
	private String name;	// encapsulation - 캡슐화)프라이빗 멤버변수를 준비
	private int age;
	// 우클릭 -> source -> generate getter and setter(자동 get set 생성)
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
	

	//method의 이름은 동사가 원칙
	
	/*
	// setter
	public void setName(String name){this.name = name;}
	public void setAge(int age) {this.age = age; }
		
	// getter
	public String getName(){ return this.name;	}
	public int getAge(){ return this.age; }
	*/
	
}

