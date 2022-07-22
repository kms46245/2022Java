package ch06.ex01.case01;

public class Main {
	public static void main(String[] args) {
		Leopard leopard = new Leopard();
		Lion lion = new Lion();
		
		leopard.run();		// 각각의 클래스에 run이라는 method가 중복된다.
		lion.run();
	}
}
