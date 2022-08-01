package ch05.ex04.case01;

public class Main {
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		System.out.printf("%d, %d", Card.width,Card.height);
		//객체를 선언하지 않더라도 call이 된다.
		
		Card.width = 10;
		Card.height = 20;	// 공유되는 변수지만 수정이 된다.
		
		//Card.kind; - instance 변수는 선언하지않았으므로 불려지지않는다.
		//Card.number;
		
		Card card1 = new Card();
		Card card2 = new Card();
		
		card1.kind = "heart";
		card1.number = 7;
		
		card2.kind = "spade";
		card2.number = 4;
		
		System.out.printf("\n%s, %s\n" ,card1.kind,card2.kind);
		System.out.printf("\n%d, %d", Card.width, Card.height);	
		System.out.printf("\n%d, %d", card1.width, card1.height);
		
		card1.width = 100;	// 임의의 객체가 값을 변경
		System.out.printf("\n%d, %d", card2.width, card2.height); // 다른 객체까지 영향을 받는다.
		
	}
}
