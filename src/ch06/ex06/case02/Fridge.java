package ch06.ex06.case02;

import ch06.ex06.case01.Appliance;

public class Fridge extends Appliance {
	@Override
	public void on() {
		System.out.println("≥√¿Â∞Ì∏¶ ƒ—¥Ÿ.");
	}
	
	@Override
	public void off() {
		System.out.println("≥√¿Â∞Ì∏¶ ≤Ù¥Ÿ.");
	}
}
