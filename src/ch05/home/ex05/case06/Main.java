package ch05.home.ex05.case06;

public class Main {
	public static void main(String[] args) {
		Phone phone = new Phone();
		User user = new User();

		phone.setBrand("�Ｚ");
		phone.setPrice(1_000_000);
		
		user.setName("���Ѽ�");	
		user.setPhone(phone);
		
		user.sendMsg();
		user.Call();
		user.playGame();
	}
}
/*
 * ����] ��ü�� �������϶�.
 * ���Ѽ��� �Ｚ���� �鸸�� �ְ� ����ϴ�.
 * �տ� �� ���� ���� �幵�մϴ�.
 * 
 * �޼����� ���� ���ϴ�.
 * ������ ����, ��ȭ�� �ɾ��, ������ �ȵǳ׿�
 * ��� �ڿ� �ٽ� �����غ��ƴϴ�.
 * ��ٸ��� ���� ������ ������ �մϴ�.
 */
