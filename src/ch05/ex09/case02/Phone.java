package ch05.ex09.case02;

public class Phone {
	private static int cnt;
	private int serial;
	
	{
		this.serial = ++cnt * 100;
	}
	// ī��Ʈ�� ���� �ø���ѹ� �Է�
	public Phone() {}
	
	// ������ �ø��� �ѹ� �Է�
	public Phone(int serial) {
		this.serial = serial;
	}
	
	public int getSerial() {
		return this.serial;
	}
}
