package ch06.ex06.case03;

public class Main {
	public static void main(String[] args) {
		//new Appliance(); 추상클래스의 영역이기에 당연히 되지않는다.
		Fridge fridge = new Fridge();
		
		fridge.on();
		fridge.off();
	}
}
