package ch05.ex09.case02;

public class Phone {
	private static int cnt;
	private int serial;
	
	{
		this.serial = ++cnt * 100;
	}
	// 카운트에 따른 시리얼넘버 입력
	public Phone() {}
	
	// 임의의 시리얼 넘버 입력
	public Phone(int serial) {
		this.serial = serial;
	}
	
	public int getSerial() {
		return this.serial;
	}
}
