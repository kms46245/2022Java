package ch06.ex06.case08;

public interface Animal {
	default void eat() {	// interface���� body�� �ִ� method - default method 
		System.out.println("������ �Դ�.");
	}
	
	void move();
}
