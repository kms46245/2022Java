package ch07.ex06.case02;

public class Alien extends Life{
	//@Override // static method를 재정의하지못한다
	// -> 그말인즉슨 static method는 상속받지 못한다.
	public static void eat() {
		System.out.println("Alien 먹다.");
	}
	
	@Override	// instance methods는 상속이 가능하다.
	public void shout() {
		System.out.println("Alien 소리치다.");
	}
}
