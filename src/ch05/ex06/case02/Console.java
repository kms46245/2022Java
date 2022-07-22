package ch05.ex06.case02;

import java.util.Scanner;

public class Console {
	private static Scanner sc;
	
	static {	// static block - 실행시기) byte code가 생성된 직후
		sc = new Scanner(System.in);
	}
	
				// 멤버변수가 멤버변수를 사용할 수 도 있다.
	private static void inMsg(String msg) {
		System.out.print(msg + "\n>");
	}
	
	public static String inStr(String msg) {
		Console.inMsg(msg);
		return sc.nextLine().trim(); // .을 이용해 연결하는 기법 - chainning
	}							 	 
	
	public static int inNum(String msg) {
		Console.inMsg(msg);
		int num = sc.nextInt();
		return num;
	}
	
	public static void info(String msg) {
		System.out.println(msg);
	}
	
	public static void err(String msg) {
		System.out.println("ERROR] " + msg);
	}
}
