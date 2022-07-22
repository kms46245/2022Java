package ch06.ex06.case02;

public class Main {
	public static void main(String[] args) {
		Fridge fridge = new Fridge();
		
		fridge.on();		// 추상클래스의 on/off를 override를 했다.
		fridge.off();
	}
}
