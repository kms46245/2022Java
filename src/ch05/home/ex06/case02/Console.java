package ch05.home.ex06.case02;

import java.util.Scanner;

public class Console {
	private static Scanner sc;
	private static boolean isGood;
	
	static {
		sc = new Scanner(System.in);
	}
	
	private static void inMsg(String msg) {
		System.out.print(msg + "\n>");
	}
	
	public static String inStr(String msg) {
		String inputStr = "";
		do {
			isGood = false;
			Console.inMsg(msg);
			inputStr = sc.nextLine().trim();
			if(inputStr.length() > 0)
				isGood = true;
			else 
				Console.err("한 글자 이상 입력하세요.");
		} while(!isGood);
		
		return inputStr;
	}							 	 
	
	public static int inNum(String msg) {
		int intNum = 0;
		String inputNum = "";
		do {
			isGood = false;
			Console.inMsg(msg);
			inputNum = sc.nextLine();
			if(inputNum.length() == 1  &&
					'0' < inputNum.charAt(0) &&	inputNum.charAt(0) <= '9') { 
				intNum = Integer.parseInt(inputNum);
				isGood = true;
			}
			else
				Console.err("한자리 자연수를 입력하세요.");
		}while(!isGood);

		return intNum;
	}
	
	public static void info(String msg) {
		System.out.println(msg);
	}
	
	public static void err(String msg) {
		System.out.println("ERROR] " + msg);
	}
}
