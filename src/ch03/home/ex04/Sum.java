package ch03.home.ex04;

import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = 0;
		
		System.out.print("A: ");
		a = sc.nextInt();
		System.out.print("B: ");
		b = sc.nextInt();
		
		System.out.printf("%d + %d = %d", a, b, a+b);
				
		/*
		 * System.out.print("A : "); int a = sc.nextInt(); System.out.print("B : "); int
		 * b = sc.nextInt();
		 * 
		 * int sum = a + b; System.out.printf("%d + %d = %d", a, b, sum);
		 */
	}
}
/* 계산기
 두 자연수를 입력 받아, 그 합계를 출력하라
 a : 1
 b : 2
 1 + 2 : 3
 */
