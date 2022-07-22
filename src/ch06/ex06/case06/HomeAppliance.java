package ch06.ex06.case06;

import ch06.ex06.case03.Appliance;
import ch06.ex06.case05.Electronic;

//자식이 interface인 경우에는 extends에 n개의 클래스가 들어간다.
public interface HomeAppliance extends Appliance, Electronic{
	
}
