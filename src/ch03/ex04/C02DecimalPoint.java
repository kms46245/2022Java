package ch03.ex04;

public class C02DecimalPoint {
	public static void main(String[] args) {
		double pi = 3.141592;
		
		double shortPi = (int)(pi * 10) / 10.0;
		System.out.println(shortPi);
		
		//double shortPi = (int)(pi * 10e2) / 10.0e2;
		//System.out.println(shortPi);
		
		//double shortPi = Math.round(pi * 10e2) / 10.0e2;	// 반올림 적용
		//System.out.println(shortPi);
	}
}
