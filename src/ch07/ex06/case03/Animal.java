package ch07.ex06.case03;

public interface Animal {
	default void eat() {
		System.out.println("ธิดู.");
	}
	
	void move();
}
