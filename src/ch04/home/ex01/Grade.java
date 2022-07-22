package ch04.home.ex01;

import java.util.Scanner;

public class Grade {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score = 0;
		int tenDigit = 0;
		int oneDigit = 0;
		String grade = "";
		
		System.out.print("점수 : ");
		score = sc.nextInt();
		
		tenDigit = score / 10;
		oneDigit = score % 10;
		
		if(tenDigit >= 9)	grade = "A";
		else if(tenDigit >= 8) 	grade = "B";
		else grade = "C";
		
		if(score >= 80) {
			if(tenDigit == 10 || oneDigit >= 8)	grade += "+";
			else if(0 <= oneDigit && oneDigit < 4)	grade += "-";
		}
		// 100점일때 a+가 안되는 버그 / c이하일때 + -가 붙는 버그를 해결하라
		/*if(tenDigit > 7 && (tenDigit == 10 || oneDigit >= 8))	grade += "+";
		else if(tenDigit > 7 && (0 <= oneDigit && oneDigit < 4))	grade += "-";
		*/
		System.out.println(grade);
	}
}
/*
 * 다음구간별로 학점을 부여하라.
 * 98 이상 = A+
 * 94 이상 = A
 * 90 이상 = A-
 * 88 이상 = B+
 * 84 이상 = B
 * 80 이상 = B-
 * 80 미만 = C
 * 
 * 점수 : 100
 * A+
 * 
 */
