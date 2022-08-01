package ch04.ex04;

import java.util.Scanner;

public class C02InLength {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = "";
		int len = 0;
		
		do {
			System.out.print("한 글자를 입력하세요.\n> ");
			input = sc.nextLine();
			len = input.length();
			System.out.println(len + "글자를 입력했습니다.");		
		} while(len != 1);
	}
}
