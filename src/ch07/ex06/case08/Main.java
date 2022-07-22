package ch07.ex06.case08;

public class Main {
	public static void main(String[] args) {
		Ship ship = new Ship();
		Container<Cow> container1 = new Container<>();	// wildcard를 이용했기때문에 객체에 맞는 리스트로 준비된다.
		Container<Car> container2 = new Container<>();
		
		ship.put(container1);
		ship.put(container2);
	}
}
