package ch05.ex07.case02;

public class Stack {
	public static void first() {
		System.out.println("Stack.first() ����.");
		int a = 0;
		Stack.second(); // instance ó�� �θ����� ������ ���(��õ��������)
		System.out.println("Stack.first() ��.");
	}
	
	public static void second() {
		System.out.println("Stack.Second() ����.");
		int a = 0;
		System.out.println("Stack.Second() ��.");
	}
}
