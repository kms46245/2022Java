package ch02.home.ex03;

import java.util.Scanner;

public class Unicode {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����: ");
		char ch = sc.nextLine().charAt(0);
		
		int unicode = ch;
		System.out.printf("%c�� unicode�� %d�Դϴ�.", ch, unicode);
		
		
		
		/*
		 * Scanner sc = new Scanner(System.in); String input = ""; char tmp = 0; int
		 * output = 0;
		 * 
		 * System.out.print("���� : "); input= sc.nextLine(); tmp = input.charAt(0);
		 * output = (int)tmp; System.out.printf("%s�� unicode�� %d�Դϴ�.\n", input, output);
		 */		
	}
}
/*
����] �Է��� ������ unicode�� ����϶�.

ex)
���� : A
A�� unicode�� 65�Դϴ�.
*/