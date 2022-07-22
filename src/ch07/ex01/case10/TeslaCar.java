package ch07.ex01.case10;

public class TeslaCar implements SelfCar{
	private SelfCar os;
	
	@Override
	public void start() {
		os.start();
	}
	
	public void setOS(SelfCar selfCar) {
		this.os = selfCar;
	}
}
