package ch05.ex07.case01;

public class Stack {
	@SuppressWarnings("unused")
	public static void first() {
		int a = 0;
		Stack.second(); // instance ó�� �θ����� ������ ���(��õ��������)
	}
	
	@SuppressWarnings("unused")
	public static void second() {
		int a = 0;
	}
}
