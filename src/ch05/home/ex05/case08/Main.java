package ch05.home.ex05.case08;

public class Main {
	public static void main(String[] args) {
		Man man1 = new Man();
		Man man2 = new Man();
		Man man3 = new Man();
		Ball ball = new Ball();
		
		man1.setName("���Ѽ�");
		man2.setName("�ѾƸ�");
		man3.setName("�����");
		
		man3.kick(man2.pass(man1.pass(ball)));	
	}
}
/*
 * ���Ѽ�, �ѾƸ�, ������� �౸�� �Ѵ�.
 * �Ѽ��̰� �Ƹ������� ���� �н��մϴ�.
 * �Ƹ��̴� ���������� ���� �н��մϴ�.
 * �����̴� ���� ����.
 * 
 */
