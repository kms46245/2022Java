package ch06.ex06.case03;

public class Fridge implements Appliance{	// extends의 상속과는 다르게 필수적으로 interface의 요소가 들어가야한다.
	@Override
	public void on() {						// abstract와 달리 method의 생성을 강제한다.(만들어놓고 쓰지않게되는 경우를 피한다)
		System.out.println("냉장고를 켜다.");
	}	
	
	@Override
	public void off() {
		System.out.println("냉장고를 끄다.");
	}
}
