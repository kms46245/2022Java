package ch05.ex01.case01;

public class Main {
	public static void main(String[] args) {
		// ������ �ϴ� ���
		int hour = 12;
		int minute = 35;
		int second = 30;
		System.out.printf("%d�� %d�� %d��\n", hour, minute, second);
		
		Time time = new Time();	// time Ŭ������ byte code�� �ε��ϴ°�(byte code�� �ҷ� type�� �ľ��Ѵ�)
		time.hour = 12;
		time.minute = 35;
		time.second = 30;
		System.out.printf("%d�� %d�� %d��\n", time.hour,time.minute,time.second);
		
		Time time2 = new Time();
		time2.hour = 10;
		time2.minute = 30;
		time2.second = 27;
		System.out.printf("%d�� %d�� %d��\n", time2.hour,time2.minute,time2.second);
		
		System.out.println(time);
		System.out.println(time2.toString());	// print���� �ڵ����� toString�� �����Ѱ��̴�.
	}
}