package ch07.ex05.case01;

public class Main {
	public static void main(String[] args) {
		Basket<Apple> basket = new Basket<Apple>(); // basket에서 e로 설정했던 모든 부분들이 apple로 결정
		basket.set(new Apple());
		System.out.println(basket.get());
		
		//basket.set(new Grape());	// Apple로 타입지정을 했기때문에 X
		
		Basket<Grape> basket2 = new Basket<Grape>();
		basket2.set(new Grape());
		System.out.println(basket2.get());
		
	}
}
