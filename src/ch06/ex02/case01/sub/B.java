package ch06.ex02.case01.sub;

import ch06.ex02.case01.A; // import�ϴ� �κ�

public class B {
	@SuppressWarnings("unused")
	public void test() {
		A a = new A();	// �ٷ� ����ϱ⿣ �ٸ���Ű���� AŬ������ �����ϱ���ϱ⿡ import�� ������Ѵ�.
		//ch06.ex02.case01.A a = new A(); // Ǯ������ �ᵵ������ �������� ������ ��������
		
		int x = 0;
		//x = a.a;
		//x = a.b; // default - �ٸ� ��Ű���� �ִ� ��� ��ü�� �Ұ���
		//x = a.c;   // protected - �ٸ� ��Ű���� �ִ� ��ӹ������� ��ü�� ������ �Ұ���
		x = a.d;
		
		//a.m1();
		//a.m2();
		//a.m3();
		a.m4();
	}
}
