package ch06.ex04.case01;

public class Cat extends Animal{
	private int age;
	
	public Cat(String name, int age) {
		//super();
		super(name);		        // 자식클래스에는 첫줄에 무조건 들어간다 -> 부모클래스의 생성자를 만드는역할
		//this.name = name;			// 자신의 속성은 자신이 초기화 하도록한다.
		this.age =age;
	}
	
	public int getAge() {
		return this.age;
	}
}
