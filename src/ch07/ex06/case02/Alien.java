package ch07.ex06.case02;

public class Alien extends Life{
	//@Override // static method�� �������������Ѵ�
	// -> �׸����ｼ static method�� ��ӹ��� ���Ѵ�.
	public static void eat() {
		System.out.println("Alien �Դ�.");
	}
	
	@Override	// instance methods�� ����� �����ϴ�.
	public void shout() {
		System.out.println("Alien �Ҹ�ġ��.");
	}
}
