package ch04.home.ex02;

import java.util.Scanner;

public class H02Season {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int month = 0;
		String season = "";
		Scanner sc = new Scanner(System.in);
		
		System.out.print("��: ");
		month = sc.nextInt();
		
		if((0 < month && month <= 2) || month == 12)
			season = "�ܿ�";
		else if(3 <= month && month <= 5)
			season = "��";
		else if(6 <= month && month <= 8)
			season = "����";
		else if(9 <= month && month <= 11)
			season = "����";
		/*
		 * else season = "";
		 * 
		 * if(season == "") System.out.print("�ش���� ���� ���Դϴ�.\n"); else
		 * System.out.printf("%d���� %s�Դϴ�.",month, season);
		 */
		else season = "�������� �ʴ� ��";
		
		System.out.printf("%d���� %s�Դϴ�.", month, season);
		}
}

/* ch04.ex02.C04Season�� refactoring �϶�
 * switch�� if��
 * �������� �ʴ� ���� �Է��� ��츦, ����ó���Ѵ�.
 */
