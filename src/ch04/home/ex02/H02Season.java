package ch04.home.ex02;

import java.util.Scanner;

public class H02Season {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int month = 0;
		String season = "";
		Scanner sc = new Scanner(System.in);
		
		System.out.print("월: ");
		month = sc.nextInt();
		
		if((0 < month && month <= 2) || month == 12)
			season = "겨울";
		else if(3 <= month && month <= 5)
			season = "봄";
		else if(6 <= month && month <= 8)
			season = "여름";
		else if(9 <= month && month <= 11)
			season = "가을";
		/*
		 * else season = "";
		 * 
		 * if(season == "") System.out.print("해당월은 없는 월입니다.\n"); else
		 * System.out.printf("%d월은 %s입니다.",month, season);
		 */
		else season = "존재하지 않는 월";
		
		System.out.printf("%d월은 %s입니다.", month, season);
		}
}

/* ch04.ex02.C04Season을 refactoring 하라
 * switch를 if로
 * 존재하지 않는 월을 입력할 경우를, 예외처리한다.
 */
