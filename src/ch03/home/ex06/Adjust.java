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
% �����ڸ� �̿��ؼ�, �Ǽ����� �Ҽ��� ���ϸ� ����ó���϶�.
(casting), math api�� ��������ʴ´�.
�Ǽ����� sc.nextDouble()�� �Է��Ѵ�.

  x: 3.1492
  ��� : 3.0
 */