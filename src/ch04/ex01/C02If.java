package ch04.ex01;

public class C02If {
	public static void main(String[] args) {
		int visitcnt = 0;
		if(visitcnt < 1) {
			System.out.println("첫 방문입니다.");
		} else {
			System.out.println("재 방문입니다.");
		}
		
		if(visitcnt<0)	{
			System.out.println("첫 방문입니다.");
			visitcnt++;
		} else 
			System.out.println("재 방문입니다.");
		
	}

}
