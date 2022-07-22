package ch05.ex05.case01;

public class Calculator {
	public int add(int a, int b) { // transparent
		return a + b;
	}
	
	public int add(int a, int b, int c) {	//overloading (파라미터가 다르다면 같은 이름을 받을 수 있다.)
		return a + b + c;
	}
}
