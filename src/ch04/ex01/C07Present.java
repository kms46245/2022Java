package ch04.ex01;

import java.util.Scanner;

public class C07Present {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int mainChoice = 0;
		int subChoice = 0;
		
		String prize = "";
		String maker = "";
		
		System.out.print("1.≥√¿Â∞Ì 2.ºº≈π±‚\n> ");
		mainChoice = sc.nextInt();
		
		if(mainChoice == 1) prize = "≥√¿Â∞Ì";
		else if(mainChoice == 2) prize = "ºº≈π±‚";
		else prize = "»≠¿Â¡ˆ";
		
		if(mainChoice < 3) {
			System.out.print("1.ªÔº∫ 2.LG\n> ");
			subChoice = sc.nextInt();
			if(subChoice == 1) maker = "ªÔº∫";
			else maker = "LG";
		}
		
		prize = maker + " " + prize;
		System.out.println(prize);
		
	}
}
