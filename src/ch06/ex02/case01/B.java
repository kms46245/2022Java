package ch06.ex02.case01;

public class B {
	public void test() {
		A a = new A();
		
		int x = 0;
		//x = a.a;	// A ��ü�� a�� private�̹Ƿ� ��ü�������� ��밡��
		x = a.b;	// �������� �����ϴ�.
		x = a.c;
		x = a.d;
		
		//a.m1();   // method�� private�� ���������� ��ü�������� ��밡��
		a.m2();
		a.m3();
		a.m4();
	}
}
