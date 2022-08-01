package ch04.ex01;

import java.util.Scanner;

public class C06Present {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		String prize = "";
		
		System.out.print("1.≥√¿Â∞Ì, 2.ºº≈π±‚\n>");
		choice = sc.nextInt();
		
		if(choice == 1)	prize = "≥√¿Â∞Ì";
		else if(choice == 2) prize = "ºº≈π±‚";
		else prize = "»≠¿Â¡ˆ";
		
		System.out.println(prize);
	}
}
