package ch06.ex01.case03;

public class Main {
	public static void main(String[] args) {
		Leopard leopard = new Leopard();
		Lion lion = new Lion();
		
		leopard.run();
		lion.run();
		
		leopard.eat();
		//lion.eat();	// lion 클래스의 method이고 상속이안되서 작동되지않는다.
		
		lion.shout();
		//leopard.shout();	// 레오파드 클래스의 method이고 상속이없으므로 작동되지않는다.
		
	}
}
