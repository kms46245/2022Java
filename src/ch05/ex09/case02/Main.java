package ch05.ex09.case02;

public class Main {
	public static void main(String[] args) {
		Phone phone1 = new Phone();
		Phone phone2 = new Phone();
		Phone phone3 = new Phone(1000);
		Phone phone4 = new Phone();
		
		// �ν��Ͻ���Ͽ� �ش�Ǿ� �⺻�� ����
		// ī��Ʈ�� ��� ����Ǳ⶧���� 300¥�� 1000�� Ư���� ���� �״����� 400�� �Ǿ���.
		System.out.printf("%d, %d, %d, %d",
				phone1.getSerial(), phone2.getSerial(),
				phone3.getSerial(), phone4.getSerial());
	}
}
