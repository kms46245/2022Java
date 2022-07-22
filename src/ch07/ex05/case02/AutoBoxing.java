package ch07.ex05.case02;

public class AutoBoxing {
	public static void main(String[] args) {
		int a1 = 1;
		Integer a2 = new Integer(1);
		int a3 = new Integer(1);	// 부모자식간의 프로모션이 아닌 각자다른객체의 변환이다
		Integer a4 = 1;		// AutoBoxing - 자연적으로 리터럴값을 해당 타입으로 boxing
							// 자동으로 7번째줄은 AutoUnboxing으로 볼수있다.
		
		boolean b1 = true;
		Boolean b2 = new Boolean(true);
		boolean b3 = new Boolean(true);
		Boolean b4 = true;
	}
}
