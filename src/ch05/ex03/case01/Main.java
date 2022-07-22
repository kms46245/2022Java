package ch05.ex03.case01;

public class Main {
	public static void main(String[] args) {
		Tv myTv = new Tv();
		
		System.out.println(myTv);
		
		System.out.printf("%s, %b, %d\n",
				myTv.getColor(), myTv.isPower(),myTv.getChannel());
		// 객체가 생성될때 변수의 초기값은 자동으로 type별 기본값이다.
		
		myTv.setColor("red");
		myTv.setPower(true);
		myTv.setChannel(7);
		
		System.out.printf("%s, %b, %d\n",
				myTv.getColor(), myTv.isPower(),myTv.getChannel());
		
	}
}
