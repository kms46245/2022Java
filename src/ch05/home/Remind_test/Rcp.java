package ch05.home.Remind_test;

import java.util.Scanner;

public class Rcp {
	private static Scanner sc;
	
	static {
		sc = new Scanner(System.in);
	}

	public static void rcpResult() {
		int pChoice = 0, cChoice = 0;
		String result = "", pChoiceStr = "", cChoiceStr = "";
				
		System.out.print("1.가위 2.바위 3.보\n>");
		pChoice = sc.nextInt();
		cChoice = (int)(Math.random() * 3) + 1;
		
		if(1 <= pChoice && pChoice <= 3) {
			switch(pChoice - cChoice) {
			case -2: case 1:
				result = "You win."; break;
			case -1: case 2:
				result = "You lose."; break;
			case 0:
				result = "Fair."; 			
			}
						
			switch(pChoice) {
			case 1: pChoiceStr = "가위"; break;
			case 2: pChoiceStr = "바위"; break;
			case 3: pChoiceStr = "보";
			}
			System.out.println("You: " + pChoiceStr);
			
			switch(cChoice) {
			case 1: cChoiceStr = "가위"; break;
			case 2: cChoiceStr = "바위"; break;
			case 3: cChoiceStr = "보";
			}
			System.out.println("Me: " + cChoiceStr);
			
		} else {
			result = "ERROR] 1, 2, 3 중에 하나를 입력하세요.";
		}
		
		System.out.println(result);
	}
}
