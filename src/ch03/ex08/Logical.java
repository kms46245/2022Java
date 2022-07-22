package ch03.ex08;

public class Logical {
	public static void main(String[] args) {
		boolean b = false;
		
		b = true && true;			// true
		b = (2 > 1) && (2 > 1);		// true
		b = (2 < 1) && (2 > 1);		// false
		b = (2 < 1) || (2 > 1);		// true
		b = (2 < 1) || (2 < 1);     // false
		
		System.out.println(b);
		
		int x = 0;
		int y = 0;
		b = ++x < 0 && ++y < 0;
		
		
	}
}
