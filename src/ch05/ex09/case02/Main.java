package ch05.ex09.case02;

public class Main {
	public static void main(String[] args) {
		Phone phone1 = new Phone();
		Phone phone2 = new Phone();
		Phone phone3 = new Phone(1000);
		Phone phone4 = new Phone();
		
		// 인스턴스블록에 해당되어 기본값 실행
		// 카운트는 계속 진행되기때문에 300짜리 1000이 특별히 들어가고 그다음은 400이 되었다.
		System.out.printf("%d, %d, %d, %d",
				phone1.getSerial(), phone2.getSerial(),
				phone3.getSerial(), phone4.getSerial());
	}
}
