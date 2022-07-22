package ch06.ex06.case08;

public class Main {
	public static void main(String[] args) {
		Elephant elephant = new Elephant();
		Goose goose = new Goose();
		
		elephant.eat();		// default method로 공동된 행동을 표현
		goose.eat();
		
		elephant.move();	// 각각의 행동도 표현하기 편해진다.
		goose.move();
		
		
	}
}
