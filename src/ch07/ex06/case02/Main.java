package ch07.ex06.case02;

public class Main {
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Life alien1 = new Alien();
		Alien alien2 = new Alien();
		
		alien1.eat();	// 해당 클래스가 가진 static method가 실행된다. 
		alien2.eat();	// 상속받는 관계가 아니기때문이다.
		
		alien1.shout();	// Override되었기때문에 자식의 method를 실행하게된다.
		alien2.shout();
		
		Life.eat();		// 헷갈리지않도록 접두사에 클래스명을 이용한다.
		Alien.eat(); 	//Line8,9처럼 이용하게되면 instance method로 오해할수있다.
	}
}
