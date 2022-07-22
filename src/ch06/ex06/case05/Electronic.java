package ch06.ex06.case05;

import java.time.LocalDate;

public interface Electronic {
	public static final int VOLTAGE = 200;	// �������� public static final�� �⺻���� �޸���.(�Ⱦ�����)
	static final String MAKER_NAME = "LG";
	final int WEIGHT = 10;
	LocalDate PRODUCED_DATE = LocalDate.of(2022, 6, 8);
	
	public abstract void displayMsg();	// method������ public abstract�� �⺻���� �޸���.
	abstract int getTemperature();
	String getModelName();
	
}
