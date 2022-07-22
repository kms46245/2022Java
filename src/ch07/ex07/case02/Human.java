package ch07.ex07.case02;

@FunctionalInterface  // method용 interface다 = 람다를 사용한다
public interface Human { // default/static method는 예외
	void say();
	
	static void walk() {
		System.out.println("Human walk");
	}
	
	default void sleep() {
		System.out.println("Human sleep");
	}
}
