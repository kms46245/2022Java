package ch06.ex06.case06;

// interface를 extends하게되면 결과적으론 이렇게 줄일수있다.
public class Fridge implements HomeAppliance{
	@Override public void on() {}
	@Override public void off() {}
	
	@Override public void displayMsg() {}
	@Override public int getTemperature() { return 0; }
	@Override public String getModelName() { return null; }
}
