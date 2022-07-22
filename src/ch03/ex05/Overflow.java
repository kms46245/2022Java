package ch03.ex05;

public class Overflow {
	public static void main(String[] args) {
		int a = 1_000_000;
		int b = 1_000_000;
		
		long c = a + b;
		System.out.println(c);
		
		c = a * b;
		System.out.println(c);		// overflow
		
		c = (long)a * b;
		System.out.println(c);
		
		//int x = a * b / a;
		//System.out.println(x);	// overflow
		
		//int x = a / a * b;		
		int x = a * (b / a);
		System.out.println(x);
		
	}
}
