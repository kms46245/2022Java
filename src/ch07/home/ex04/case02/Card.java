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
		//return this.numStr; // int�� �޾Ƽ� string���� ��ȯ ������������ casting �̿��ϱ�
		return this.num + "";
	}
}
