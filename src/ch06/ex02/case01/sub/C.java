package ch06.ex02.case01.sub;

import ch06.ex02.case01.A;

public class C extends A{
	@SuppressWarnings("unused")
	public void test() {
		int x = 0;
		
		//x = this.a;
		//x = this.b; // default - 다른 패키지에 있는 모든 객체가 불가능
		x = this.c;   // protected - 다른 패키지에 있어도 상속받은 객체는 접근이 가능
		x = this.d;
	
		//this.m1();
		//this.m2();
		this.m3();
		this.m4();
	}
}
