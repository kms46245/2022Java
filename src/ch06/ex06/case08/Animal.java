package ch06.ex06.case08;

public interface Animal {
	default void eat() {	// interface에서 body가 있는 method - default method 
		System.out.println("입으로 먹다.");
	}
	
	void move();
}
