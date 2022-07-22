package ch07.ex01.case01;

public class Main {
	public static void main (String []args) {
		C c = new C();
		B b = c;
		A a = c;
		
		c = (C)a;
		c = (C)b;
		
		b = (B)a;
			
		//String s = (String)c;		//가지고있지않은 type으로는 프로모션이 안된다.
	}
}
