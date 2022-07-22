package ch05.ex05.case07;

public class Retailer {
	public Apple Sell(Apple apple) {
		apple.setPrice(apple.getPrice() * 2); // 마진을 붙이는 행위를 코딩
		return apple;
	}
}
