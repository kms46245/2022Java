package ch05.ex07.case01;

public class Stack {
	@SuppressWarnings("unused")
	public static void first() {
		int a = 0;
		Stack.second(); // instance 처럼 부를수도 있지만 경고(추천하지않음)
	}
	
	@SuppressWarnings("unused")
	public static void second() {
		int a = 0;
	}
}
