 package ch07.home.ex04.case02;

public class Card {
	private int num;
	//private String numStr;
	
	public Card(int num) {
		this.num = num;
		//this.numStr = numStr;
	}

	/*public int getNum() {
		return num;
	}*/
	
	@Override
	public String toString() {
		//return this.numStr; // int형 받아서 string으로 변환 따로하지말고 casting 이용하기
		return this.num + "";
	}
}
