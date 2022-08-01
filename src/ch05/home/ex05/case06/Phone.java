package ch05.home.ex05.case06;

public class Phone {
	@SuppressWarnings("unused")
	private String brand;
	@SuppressWarnings("unused")
	private int price;
	
	public void sendMsg() {}
	public void Call() {}
	public void playGame() {}	
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
}
