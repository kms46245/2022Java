package ch06.ex02.case01;

public class C extends A{	// A�� ��ӹ��� C
	public void test() {
		int x = 0;
		
		//x = this.a; // private�� ��ӹ޴��� �Ұ���
		x = this.b;	  // this�� ���ɼ� �ִ� ������ this�� �ᱹ A�� �ǰ� C(A�� ��ӹ���)�� �Ǳ⶧��
		x = this.c;
		x = this.d;
		
		//this.m1();   // method�� ��������
		this.m2();
		this.m3();
		this.m4();
	}
}
