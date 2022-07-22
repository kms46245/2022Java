package ch05.ex07.case02;

public class Stack {
	public static void first() {
		System.out.println("Stack.first() 시작.");
		int a = 0;
		Stack.second(); // instance 처럼 부를수도 있지만 경고(추천하지않음)
		System.out.println("Stack.first() 끝.");
	}
	
	public static void second() {
		System.out.println("Stack.Second() 시작.");
		int a = 0;
		System.out.println("Stack.Second() 끝.");
	}
}
