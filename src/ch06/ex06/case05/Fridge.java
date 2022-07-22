package ch06.ex06.case05;

import ch06.ex06.case03.Appliance;
														// extends는 하나만 사용됨
public class Fridge implements Appliance, Electronic { // implements에는 클래스가 n개 들어간다.(1개가아님)
	@Override public void on() {}
	@Override public void off() {}
	
	@Override public void displayMsg() {}
	@Override public int getTemperature() { return 0; }
	@Override public String getModelName() { return null; }
	
}
