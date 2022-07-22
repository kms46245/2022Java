package ch02.home.ex03;

import java.util.Scanner;

public class Unicode {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자: ");
		char ch = sc.nextLine().charAt(0);
		
		int unicode = ch;
		System.out.printf("%c의 unicode는 %d입니다.", ch, unicode);
		
		
		
		/*
		 * Scanner sc = new Scanner(System.in); String input = ""; char tmp = 0; int
		 * output = 0;
		 * 
		 * System.out.print("문자 : "); input= sc.nextLine(); tmp = input.charAt(0);
		 * output = (int)tmp; System.out.printf("%s의 unicode는 %d입니다.\n", input, output);
		 */		
	}
}
/*
과제] 입력한 문자의 unicode를 출력하라.

ex)
문자 : A
A의 unicode는 65입니다.
*/