package ch07.ex01.case05;

public class Main {
	public static void main (String []args) {
		Car car = new FireEngine();
		car.run();
		// car.water();		//car클래스에는 water가 존재하지않는다.
			
		FireEngine fireEngine = (FireEngine)car;
		fireEngine.water();	// fireengine형으로 변환하면 water를 사용할 수 있다
		fireEngine.run();
			
		((Car)fireEngine).run();
	}
}