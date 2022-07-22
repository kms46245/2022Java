package ch06.ex01.case02;

public class Main {
	public static void main(String[] args) {
		Leopard leopard = new Leopard();
		Lion lion = new Lion();
		
		leopard.run();	// run 메소드가 beast로 부터 상속을 받았다.
		lion.run();
	}
}
