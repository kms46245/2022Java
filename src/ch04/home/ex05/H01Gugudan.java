package ch04.home.ex05;

public class H01Gugudan {
	public static void main(String[] args) {
		int i = 0, j = 0, res = 0;
		
		for	(i = 2; i <= 9; i++) {
			for(j = 1; j <= 9; j++) {
				res = i * j;
				System.out.printf("%d * %d = %d\n", i, j, res);
			}
			System.out.println("----------");
		}		
	}
}
/*
 * 과제] 구구단을 출력하라.
 * 
 * 
 * 2 * 1 = 2
 * 2 * 2 = 4
 * ...
 * 2 * 9 = 18
 * --------
 * 3 * 1 = 3
 * 3 * 2 = 6
 * .....
 * 9 * 9 = 81;
 */
