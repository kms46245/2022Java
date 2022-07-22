package ch06.ex06.case05;

import java.time.LocalDate;

public interface Electronic {
	public static final int VOLTAGE = 200;	// 변수에는 public static final이 기본으로 달린다.(안쓰더라도)
	static final String MAKER_NAME = "LG";
	final int WEIGHT = 10;
	LocalDate PRODUCED_DATE = LocalDate.of(2022, 6, 8);
	
	public abstract void displayMsg();	// method에서는 public abstract가 기본으로 달린다.
	abstract int getTemperature();
	String getModelName();
	
}
