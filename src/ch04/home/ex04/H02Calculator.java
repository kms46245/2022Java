package ch04.home.ex04;

import java.util.Scanner;

public class H02Calculator {
	@SuppressWarnings("resource")
	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = 0;
		char op = 0;
		int result = 0;
		char isRepeat = 0;		//toggle 변수의 이름은 isXxx 가 좋다.
		
		do{
			System.out.print("a: ");
			a = sc.nextInt(); sc.nextLine();		// 정수 받은후 문자를 받기위한 쓰레기값 처리
			System.out.print("op: ");
			op = sc.nextLine().charAt(0);
			System.out.print("b: ");
			b = sc.nextInt(); sc.nextLine();
			
			switch(op) {
				case '+': result = a + b; break;
				case '-': result = a - b; break; 
				case '*': result = a * b; break;
				case '/': result = a / b;
			}
			
			System.out.printf("%d %c %d = %d\n",a, op, b, result);
			System.out.print("계속하시겠습니까? (y/n)\n>");
			isRepeat = sc.nextLine().charAt(0);			
		}while(isRepeat == 'y');
		
		System.out.print("끝.");
	}
}
/*
 * 사칙연산이 가능한 계산기를 만들어라
 * 연산자는 + - * , /이다
 * / 는 몫만을 얻는다.
 */

/*
 * Scanner sc = new Scanner(System.in); int x = 0, y = 0, res = 0; String op =
 * "", ans = ""; boolean isPower = false;
 * 
 * do { System.out.print("A : "); x = sc.nextInt(); sc.nextLine();
 * System.out.print("op : "); op = sc.nextLine(); System.out.print("B : "); y =
 * sc.nextInt();
 * 
 * switch(op) { case "+": res = x + y; break; case "-": res = x - y; break; case
 * "*": res = x * y; break; case "/": res = x / y; }
 * 
 * System.out.printf("%d %s %d = %d\n", x, op, y, res); sc.nextLine();
 * System.out.print("계속하시겠습니까(y/n)?\n>"); ans = sc.nextLine();
 * 
 * if(ans.equals("y")) isPower = false; else if(ans.equals("n")) isPower = true;
 * 
 * }while(!isPower);
 * 
 * System.out.print("계산기를 종료합니다.");
 */