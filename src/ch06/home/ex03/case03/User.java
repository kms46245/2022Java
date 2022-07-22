package ch06.home.ex03.case03;

public class User {
	private String name;
	private int age;
	
	public User(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {		
		//return this.name + " " + this.age + "살";
		return String.format("%s %d살", name, age); //  리턴값을 일일히 쓸필요없이 format을 이용한다.
	}	
}
