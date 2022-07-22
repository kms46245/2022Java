package ch02.home.ex01;

public class H01Replacement {
	public static void main(String[] args) {
		/*
		int a = 1;
		int b = 2;
		int rep = 0;
		
		System.out.printf("a = %d\n = %d\n", a, b);
		
		rep = a;	// 중간값으로 a를저장
		a = b;		// b를 a에 저장
		b = rep;	// a로 저장한 중간값을 b에 저장
		
		System.out.printf("a = %d\nb = %d\n", a, b);
		*/
		int a = 1;
		int b = 2;
		
		int temp = 0;
		
		temp = a;
		a = b;
		b = temp;
	}
	/*과제] 두변수의 데이터를 교체하라 
	       a = 1 b = 2
	       a = 2 b = 1 
	 */
}
