package ch03.home.ex06;

import java.util.Scanner;

public class Adjust {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x = 0.0;
		double result = 0.0;
		
		System.out.print("x: ");
		x = sc.nextDouble();
		
		result = x - (x % 1);
		System.out.printf("%.3f", result);
			
		
		
		/*
		 * double x = 0.0;
		 * 
		 * 
		 * System.out.print("X : "); x = sc.nextDouble();
		 * 
		 * x = x - (x % 1); System.out.printf("result = %.3f", x);
		 */
	}
}

/*
% 연산자를 이용해서, 실수값의 소수점 이하를 내리처리하라.
(casting), math api를 사용하지않는다.
실수값은 sc.nextDouble()로 입력한다.

  x: 3.1492
  결과 : 3.0
 */