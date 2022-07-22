package ch07.ex06.case06;

public class Main {
	public static void main(String[] args) {
		Cabinet<A> cabinet1 = new Cabinet<>();
		Cabinet<B> cabinet2 = new Cabinet<>();
		//Cabinet<C> cabinet3 = new Cabinet<>(); // A이하로 받는 속성중 C는 없기때문에 X
		
		A[] arr1 = {new A(), new A() };
		B[] arr2 = {new B(), new B() };
		C[] arr3 = {new C(), new C() };
		D[] arr4 = {new D(), new D() };
		
		cabinet1.getLastVal(arr1);	// 해당 클래스의 속성이 제한내에 있기에 사용가능
		cabinet1.getLastVal(arr2);
		cabinet2.getLastVal(arr2);   // 원인) B타입이 A타입으로 프로모션이 되었다. 그러므로 컴파일에러 X
		//cabinet2.getLastVal(arr1); // 타입이 일치하지않으므로 불가능(역으로 프로모션은 안된다.)
		
		//cabinet1.getFinalVal(arr1);
		//cabinet1.getFinalVal(arr2);		// A,B클래스는 C이하에 해당안되기때문에 X 
		cabinet1.getFinalVal(arr3);
		cabinet1.getFinalVal(arr4);
	}
}
