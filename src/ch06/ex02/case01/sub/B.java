package ch06.ex02.case01.sub;

import ch06.ex02.case01.A; // import하는 부분

public class B {
	@SuppressWarnings("unused")
	public void test() {
		A a = new A();	// 바로 사용하기엔 다른패키지의 A클래스를 인지하기못하기에 import를 해줘야한다.
		//ch06.ex02.case01.A a = new A(); // 풀네임을 써도되지만 가독성이 현저히 떨어진다
		
		int x = 0;
		//x = a.a;
		//x = a.b; // default - 다른 패키지에 있는 모든 객체가 불가능
		//x = a.c;   // protected - 다른 패키지에 있는 상속받지않은 객체는 접근이 불가능
		x = a.d;
		
		//a.m1();
		//a.m2();
		//a.m3();
		a.m4();
	}
}
