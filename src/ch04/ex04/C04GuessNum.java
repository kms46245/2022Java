package ch04.ex04;

import java.util.Scanner;

public class C04GuessNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int target = 0;
		int guess = 0;
		int tries = 0;
		String msg = "";
		
		target = (int)(Math.random()* 10) + 1;
		
		do {
			System.out.print("Âï¾îºÁ.:");
			guess = sc.nextInt();
			tries++;
			
			if(guess > target) msg ="Down";
			else if(guess < target) msg = "up";
			else msg = "Great";
			System.out.println(msg);			
		} while(guess != target);
		
		System.out.printf("%d¹ø¸¸¿¡ %d¸¦ ¸ÂÃè½À´Ï´Ù.", tries, target);
	}

}
