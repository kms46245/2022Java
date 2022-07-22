package ch06.ex02.case01;

public class B {
	public void test() {
		A a = new A();
		
		int x = 0;
		//x = a.a;	// A 객체의 a는 private이므로 객체내에서만 사용가능
		x = a.b;	// 나머지는 가능하다.
		x = a.c;
		x = a.d;
		
		//a.m1();   // method도 private는 마찬가지로 객체내에서만 사용가능
		a.m2();
		a.m3();
		a.m4();
	}
}
