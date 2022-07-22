package ch07.ex04.case03;

public class Main {
	public static void main(String[] args) {
		Cat[] cats = new Cat[3];
		
		cats[0] = new Cat("헤롱이");
		cats[1] = new Cat("야코미");
		cats[2] = new Cat("새코미");
		
		//cats[2] = new Dog();	// 다른 타입은 배열에 들어올수 없다.
		
		for(Cat cat: cats) System.out.println(cat);
	}
}
