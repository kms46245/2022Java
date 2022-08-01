package ch04.ex04;

import java.util.Scanner;

public class C03InOneNum {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int input = 0;
		
		do {
			System.out.print("ÀÔ·Â: ");
			input = sc.nextInt();
		}while(!(1 <= input && input <= 9));
	
		System.out.print("³¡");
	}
}