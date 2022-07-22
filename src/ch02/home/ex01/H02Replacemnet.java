package ch02.home.ex01;

import java.util.Scanner;

public class H02Replacemnet {
	public static void main(String[] args) {
	
	/*Scanner sc = new Scanner(System.in);
	System.out.print("A에 들어갈 값을 입력하세요.\n>");
	int i = sc.nextInt();
	System.out.print("B에 들어갈 값을 입력하세요.\n>");
	int j = sc.nextInt();

	System.out.printf("입력된 값\nA : %d\nB : %d\n",i , j);
	
	int tmp = 0;
	tmp = i;
	i = j;
	j = tmp;
	
	System.out.printf("교체된 결과 값\nA : %d\nB : %d\n",i , j);
	*/
		
	Scanner sc = new Scanner(System.in);
	
	// presentation logic(화면에 출력되는 logic)
	System.out.print("a: ");	
	int a = sc.nextInt();
	System.out.print("b: ");
	int b = sc.nextInt();
	System.out.printf("=> a: %d, b : %d\n", a, b);
	
	System.out.println("=> a, b 값을 교체합니다.");
	// business logic (화면에 출력되지않고 작업하는 logic)
	int temp = 0;
	temp = a;
	a = b;
	b = temp;
	System.out.printf("=> a: %d, b: %d\n", a, b);
	
	}
}
/*  과제] a,b 변수의 값을 교체하라
	a와 b의 값을 임의로 입력 받는다
	교체 결과를 출력한다. */