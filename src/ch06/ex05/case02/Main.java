package ch06.ex05.case02;

public class Main {
	public static void main(String[] args) {
		Dog dog = new Dog(1);
		
		dog.shout();
		System.out.println(dog.getAge()); // Dog에 있는 1살이아닌 Animal에 있는 1000살이 가져와진다.
										  // case01에 있는 현상과 같음
										  // 그렇기때문에 dog에도 getAge를 override하면 원하는 1살을 가져올수있다.
	}
}
