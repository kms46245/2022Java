package ch07.ex07.case04;

public class Main {
	public static void main(String[] args) {
		Shooter shooter = new Shooter();
		Smith smith = new Smith();
		
		shooter.fire(() -> System.out.println("탕탕.")); // method를 data로써 사용했다.
		shooter.fire(smith.makeGun());
	}
}
