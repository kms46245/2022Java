package ch06.ex02.case01.sub;

import ch06.ex02.case01.A;

public class C extends A{
	@SuppressWarnings("unused")
	public void test() {
		int x = 0;
		
		//x = this.a;
		//x = this.b; // default - �ٸ� ��Ű���� �ִ� ��� ��ü�� �Ұ���
		x = this.c;   // protected - �ٸ� ��Ű���� �־ ��ӹ��� ��ü�� ������ ����
		x = this.d;
	
		//this.m1();
		//this.m2();
		this.m3();
		this.m4();
	}
}
