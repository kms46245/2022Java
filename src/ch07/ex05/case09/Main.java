package ch07.ex05.case09;

public class Main {
	public static void main(String[] args) {
		C c = new C();
		String msg = "";
		
		//a instanceof A => a�� AŬ������ �ν��Ͻ��ٸ� ��Ÿ��
		//C�� ���� C�� ��Ӱ��迡 �ִ� A B�� �⺻������ ��ӹ޴� OBject���� �ش� 
		if(c instanceof C) msg += "C ";
		if(c instanceof B) msg += "B ";
		if(c instanceof A) msg += "A ";
		if(c instanceof Object) msg += "Object ";
		System.out.println(msg);
		
		B b = new B();	// B�� b�� Object�� �ش�
		msg = "";
		if(b instanceof C) msg += "C ";
		if(b instanceof B) msg += "B ";
		if(b instanceof A) msg += "A ";
		if(b instanceof Object) msg += "Object ";
		System.out.println(msg);
		
		
		//if(b instanceof F)// ������ ���� Ŭ������ �����Ͽ���
		//if(c instanceof F)
		
		F f = new F();
		msg = "";
		//if(f instanceof C) // F�� C�� ���ΰ��谡 �������⿡ X
		if(f instanceof A) msg += "A "; // �������̽��� �ν��Ͻ����꿡�� �����Ӵ�
		System.out.println(msg);
	}
}
