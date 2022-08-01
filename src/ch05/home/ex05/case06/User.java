package ch05.home.ex05.case06;

public class User {
	@SuppressWarnings("unused")
	private String name;
	private Phone phone;
	
	public void sendMsg() {
		phone.sendMsg();
	}
	public void Call() {
		phone.Call();
	}
	public void playGame() {
		phone.playGame();
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPhone(Phone phone) {
		this.phone = phone;
	}	
}
