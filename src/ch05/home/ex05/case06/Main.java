package ch05.home.ex05.case06;

public class Main {
	public static void main(String[] args) {
		Phone phone = new Phone();
		User user = new User();

		phone.setBrand("삼성");
		phone.setPrice(1_000_000);
		
		user.setName("최한석");	
		user.setPhone(phone);
		
		user.sendMsg();
		user.Call();
		user.playGame();
	}
}
/*
 * 과제] 객체를 디자인하라.
 * 최한석은 삼성폰을 백만원 주고 샀습니다.
 * 손에 든 폰을 보니 흐뭇합니다.
 * 
 * 메세지를 보내 봅니다.
 * 답장이 없어, 전화를 걸어보니, 연결이 안되네요
 * 잠시 뒤에 다시 연락해보렵니다.
 * 기다리는 동안 폰으로 게임을 합니다.
 */
