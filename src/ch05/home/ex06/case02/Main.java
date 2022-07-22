package ch05.home.ex06.case02;

public class Main {
	public static void main(String[] args) {
		Console.inStr("문자를 입력하세요.");
		Console.inNum("숫자를 입력하세요.");
		
		Console.info("끝.");
	}
}
/*
 * Console을 고도화 하라.
 * (예외처리)
 * Console.inStr(): 한글자 이상 입력해야한다. - 참
 * Console.inNum(): 한자리 자연수를 입력해야한다. - 참
 * ------
 * 문자를 입력하세요.
 * > hello
 * 숫자를 입력하세요.
 * > 12
 * ERROR] 한자리 자연수를 입력하세요.
 * 숫자를 입력하세요.
 * > 1
 * 끝.
 */