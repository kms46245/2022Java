package ch05.ex03.case02;

public class Main {
	public static void main(String[] args) {
		Tv tv1 = new Tv();
		Tv tv2 = new Tv();
		
		System.out.printf("%s\n%s\n\n", tv1, tv2);
		System.out.printf("%s\n%s\n\n", tv1.getColor(),tv2.getColor());
		
		tv1.setColor("red");
		System.out.printf("%s\n%s\n\n", tv1.getColor(),tv2.getColor());
		
		tv2 = tv1;	// 객체를 객체에 할당할 수 있다.(주소값이 담겨진다.)
		System.out.printf("%s\n%s\n\n", tv1,tv2);
		
		// 할당이 되었거나 되지않은 가리켜지지않는 값 = garbage
		// -> garbage collector가 주기적으로 정리해서 없애버린다.
	}
}
