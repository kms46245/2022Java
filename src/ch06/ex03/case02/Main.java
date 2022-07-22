package ch06.ex03.case02;

public class Main {
	public static void main(String[] args) {
		Cat cat = new Cat();
		Dog dog = new Dog();

		cat.shout();	// override를 했기때문에 부모클래스의 으르렁이 아닌 
		dog.shout();	// 자식클래스의 야옹/멍멍이 나간다
	}
}
