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
		char isRepeat = 0;		//toggle ������ �̸��� isXxx �� ����.
		
		do{
			System.out.print("a: ");
			a = sc.nextInt(); sc.nextLine();		// ���� ������ ���ڸ� �ޱ����� �����Ⱚ ó��
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
			System.out.print("����Ͻðڽ��ϱ�? (y/n)\n>");
			isRepeat = sc.nextLine().charAt(0);			
		}while(isRepeat == 'y');
		
		System.out.print("��.");
	}
}
/*
 * ��Ģ������ ������ ���⸦ ������
 * �����ڴ� + - * , /�̴�
 * / �� ���� ��´�.
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
 * System.out.print("����Ͻðڽ��ϱ�(y/n)?\n>"); ans = sc.nextLine();
 * 
 * if(ans.equals("y")) isPower = false; else if(ans.equals("n")) isPower = true;
 * 
 * }while(!isPower);
 * 
 * System.out.print("���⸦ �����մϴ�.");
 */