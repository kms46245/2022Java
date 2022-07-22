package ch03.home.ex09;

import java.util.Scanner;

public class Grade {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int kor, eng, math, sum;
		float avg;
		char grade;
		
		System.out.print("국어 : ");
		kor = sc.nextInt();
		System.out.print("영어 : ");
		eng = sc.nextInt();
		System.out.print("수학 : ");
		math = sc.nextInt();
		
		sum = kor + eng + math;
		avg = (float)sum / 3;
		grade = avg >= 90 ?'A' : (avg>=80 ? 'B' : 'C');
		
		System.out.printf("총점 : %d\n평균 : %.1f\n학점 : %c\n", sum, avg, grade);
	}
}

/* 국어 영어 수학점수 입력 받는다
 * 총점 평균 학점을 출력
 * 평균점수는 소수점이라 1자리까지만 출력한다.
 * 90 <= mean <= 100 : A
 * 80 <= mean <= 90 : B
 *       mean < 90 : C
 *       
 * ex)
 * 국어 : 95
 * 영어 : 100
 * 수학 : 100
 * 
 * 총점 : 295
 * 평균 : 98.3
 * 학점 : A
 */
