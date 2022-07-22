package ch04.ex01;

public class C04Condition {
	public static void main(String[] args) {
		int a = 3;
		if(0 < a && a < 4)	System.out.println("Good");

		//과제] b값이, 'a'초과 'c'미만 범위에 속하면, good를 출력하라.
		char b = 'b';
		if('a' < b && b < 'c')	System.out.println("Good");
		
		int x = 0;
		int y = 0;
		if((x = 1 + 2) > 0 || (y = 1 - 2) > 0)	// or연산자가 첫 조건을 만족하고 바로 넘어갔기에 y 연산이 안된다.
			System.out.printf("x : %d\ny : %d\n", x, y);
		
		//과제] S값이 he, HE, He, hE 중에 하나라도 걸리면 he를 출력하라
		
		String s = "he"; boolean Con1 = s.equals("he"); boolean Con2 = s.equals("HE");
		boolean Con3 = s.equals("He"); boolean Con4 = s.equals("hE");
		  
		  
		if(Con1 || Con2 || Con3 || Con4) System.out.println("he");
		 
		
		s = "";
		if(s.equals("")) System.out.println("값이 없다.");
		
		// 과제] 값이 있으면, 값이 있다를 말하라.
		s = "Hello";
		if(!s.equals(""))	System.out.println("값이 있다.");
		
		boolean power = false;
		if(!power)
			System.out.println("전원을 켰습니다.");			
	}
}
