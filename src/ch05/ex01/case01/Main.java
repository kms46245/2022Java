package ch05.ex01.case01;

public class Main {
	public static void main(String[] args) {
		// 기존에 하던 방식
		int hour = 12;
		int minute = 35;
		int second = 30;
		System.out.printf("%d시 %d분 %d초\n", hour, minute, second);
		
		Time time = new Time();	// time 클래스의 byte code를 로딩하는것(byte code를 불러 type을 파악한다)
		time.hour = 12;
		time.minute = 35;
		time.second = 30;
		System.out.printf("%d시 %d분 %d초\n", time.hour,time.minute,time.second);
		
		Time time2 = new Time();
		time2.hour = 10;
		time2.minute = 30;
		time2.second = 27;
		System.out.printf("%d시 %d분 %d초\n", time2.hour,time2.minute,time2.second);
		
		System.out.println(time);
		System.out.println(time2.toString());	// print에서 자동으로 toString을 참조한것이다.
	}
}
