package ch05.home.ex05.case08;

public class Main {
	public static void main(String[] args) {
		Man man1 = new Man();
		Man man2 = new Man();
		Man man3 = new Man();
		Ball ball = new Ball();
		
		man1.setName("최한석");
		man2.setName("한아름");
		man3.setName("양승일");
		
		man3.kick(man2.pass(man1.pass(ball)));	
	}
}
/*
 * 최한석, 한아름, 양승일이 축구를 한다.
 * 한석이가 아름이한테 공을 패스합니다.
 * 아름이는 승일이한테 공을 패스합니다.
 * 승일이는 공을 찬다.
 * 
 */
