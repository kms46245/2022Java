package ch07.ex06.case02;

public class Main {
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Life alien1 = new Alien();
		Alien alien2 = new Alien();
		
		alien1.eat();	// �ش� Ŭ������ ���� static method�� ����ȴ�. 
		alien2.eat();	// ��ӹ޴� ���谡 �ƴϱ⶧���̴�.
		
		alien1.shout();	// Override�Ǿ��⶧���� �ڽ��� method�� �����ϰԵȴ�.
		alien2.shout();
		
		Life.eat();		// �򰥸����ʵ��� ���λ翡 Ŭ�������� �̿��Ѵ�.
		Alien.eat(); 	//Line8,9ó�� �̿��ϰԵǸ� instance method�� �����Ҽ��ִ�.
	}
}
