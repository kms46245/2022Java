package ch05.ex05.case07;

public class Retailer {
	public Apple Sell(Apple apple) {
		apple.setPrice(apple.getPrice() * 2); // ������ ���̴� ������ �ڵ�
		return apple;
	}
}
