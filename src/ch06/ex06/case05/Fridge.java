package ch06.ex06.case05;

import ch06.ex06.case03.Appliance;
														// extends�� �ϳ��� ����
public class Fridge implements Appliance, Electronic { // implements���� Ŭ������ n�� ����.(1�����ƴ�)
	@Override public void on() {}
	@Override public void off() {}
	
	@Override public void displayMsg() {}
	@Override public int getTemperature() { return 0; }
	@Override public String getModelName() { return null; }
	
}
