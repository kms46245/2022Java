package ch04.ex01;

public class C02If {
	public static void main(String[] args) {
		int visitcnt = 0;
		if(visitcnt < 1) {
			System.out.println("ù �湮�Դϴ�.");
		} else {
			System.out.println("�� �湮�Դϴ�.");
		}
		
		if(visitcnt<0)	{
			System.out.println("ù �湮�Դϴ�.");
			visitcnt++;
		} else 
			System.out.println("�� �湮�Դϴ�.");
		
	}

}
