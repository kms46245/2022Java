package ch07.ex05.case09;

public class Main {
	public static void main(String[] args) {
		C c = new C();
		String msg = "";
		
		//a instanceof A => a는 A클래스의 인스턴스다를 나타냄
		//C는 본인 C에 상속관계에 있는 A B와 기본적으로 상속받는 OBject까지 해당 
		if(c instanceof C) msg += "C ";
		if(c instanceof B) msg += "B ";
		if(c instanceof A) msg += "A ";
		if(c instanceof Object) msg += "Object ";
		System.out.println(msg);
		
		B b = new B();	// B는 b와 Object만 해당
		msg = "";
		if(b instanceof C) msg += "C ";
		if(b instanceof B) msg += "B ";
		if(b instanceof A) msg += "A ";
		if(b instanceof Object) msg += "Object ";
		System.out.println(msg);
		
		
		//if(b instanceof F)// 엮이지 않은 클래스는 컴파일에러
		//if(c instanceof F)
		
		F f = new F();
		msg = "";
		//if(f instanceof C) // F와 C는 엮인관계가 전혀없기에 X
		if(f instanceof A) msg += "A "; // 인터페이스는 인스턴스오브에서 자유롭다
		System.out.println(msg);
	}
}
