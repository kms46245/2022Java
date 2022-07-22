package ch03.home.ex09;

import java.util.Scanner;

public class Grade {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int kor, eng, math, sum;
		float avg;
		char grade;
		
		System.out.print("���� : ");
		kor = sc.nextInt();
		System.out.print("���� : ");
		eng = sc.nextInt();
		System.out.print("���� : ");
		math = sc.nextInt();
		
		sum = kor + eng + math;
		avg = (float)sum / 3;
		grade = avg >= 90 ?'A' : (avg>=80 ? 'B' : 'C');
		
		System.out.printf("���� : %d\n��� : %.1f\n���� : %c\n", sum, avg, grade);
	}
}

/* ���� ���� �������� �Է� �޴´�
 * ���� ��� ������ ���
 * ��������� �Ҽ����̶� 1�ڸ������� ����Ѵ�.
 * 90 <= mean <= 100 : A
 * 80 <= mean <= 90 : B
 *       mean < 90 : C
 *       
 * ex)
 * ���� : 95
 * ���� : 100
 * ���� : 100
 * 
 * ���� : 295
 * ��� : 98.3
 * ���� : A
 */
