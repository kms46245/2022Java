package ch06.ex04.case01;

public class Main {
	public static void main(String[] args) {
		Cat cat = new Cat("¾ßÄÚ¹Ì", 3);
		
		cat = new Cat(null, 0);
		
		System.out.println(cat.getName() + ", " + cat.getAge());
	}
}