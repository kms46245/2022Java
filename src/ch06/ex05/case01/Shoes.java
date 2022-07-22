package ch06.ex05.case01;

public class Shoes extends Product{
	private int price;			// member variable이 부모자식간에 같은경우
	
	public Shoes(int price) {
		super(price);
		this.price = price;		// 각 클래스타입별로 price가 중복되어서 VM의 설계에 의해 product의 price가 불려지도록 설정된다.
								// 하지만 각 클래스타입의 price의 값은 존재한다.
	}
}
