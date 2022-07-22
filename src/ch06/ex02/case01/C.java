package ch06.ex02.case01;

public class C extends A{	// A를 상속받은 C
	public void test() {
		int x = 0;
		
		//x = this.a; // private은 상속받더라도 불가능
		x = this.b;	  // this가 사용될수 있는 이유는 this가 결국 A도 되고 C(A에 상속받은)도 되기때문
		x = this.c;
		x = this.d;
		
		//this.m1();   // method도 마찬가지
		this.m2();
		this.m3();
		this.m4();
	}
}
