package ch04.ex04;

import java.util.Scanner;

public class C02InLength {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = "";
		int len = 0;
		
		do {
			System.out.print("�� ���ڸ� �Է��ϼ���.\n> ");
			input = sc.nextLine();
			len = input.length();
			System.out.println(len + "���ڸ� �Է��߽��ϴ�.");		
		} while(len != 1);
	}
}
