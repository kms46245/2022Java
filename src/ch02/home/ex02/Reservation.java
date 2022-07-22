package ch02.home.ex02;

import java.time.LocalDate;
import java.util.Scanner;

public class Reservation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year = 0;
		int month = 0;
		int day = 0;
		
		System.out.println("���� ���ڸ� �Է��ϼ���.");
		System.out.print("�� : ");
		year = sc.nextInt();
		System.out.print("�� : ");
		month = sc.nextInt();
		System.out.print("�� : ");
		day = sc.nextInt();
		
		LocalDate showDate = LocalDate.of(year, month, day);
		
		
		System.out.println();
		System.out.println(showDate + " ������ �����߽��ϴ�.");
		System.out.println(showDate.minusDays(3) + "���� ȯ���� �����մϴ�.");
		
		// ����)
		/*
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * int year = 1900; int month = 1; int day = 1; LocalDate date =
		 * LocalDate.of(year, month, day); LocalDate refDate = date.minusDays(3);
		 * 
		 * System.out.println("���� ���ڸ� �Է��ϼ���."); System.out.print("�� : "); year =
		 * sc.nextInt(); System.out.print("�� : "); month = sc.nextInt();
		 * System.out.print("�� : "); day = sc.nextInt();
		 * 
		 * date = LocalDate.of(year, month, day); refDate = date.minusDays(3);
		 * 
		 * System.out.print("\n" + date + " ������ �����߽��ϴ�.\n"); System.out.print(refDate +
		 * " ���� ȯ���� �����մϴ�.");
		 */
				
	}
}

/*
 *  �����ϴ� ���α׷� �ۼ�
 *  ȯ���� �����Ϸ� ���� 3�� �� ���� �����ϴ�.
 ex) --
 ���� ���ڸ� �Է��ϼ���.
 �� : 2025
 �� : 7
 �� : 17
 
 2025-07-17 ������ �����߽��ϴ�.
 2025-07-14 ���� ȯ���� �����մϴ�.
 */