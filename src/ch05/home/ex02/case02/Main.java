package ch05.home.ex02.case02;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Paper paper = new Paper();
		
		System.out.print("�޼��� : ");
		paper.setMsg(sc.nextLine());
		System.out.print("�ۼ��ڸ� : ");
		paper.setWritterName(sc.nextLine());
		
		System.out.printf("\n%s from %s.", paper.getMsg(), paper.getWritterName());
	}
}
/*
 * ���̿� �޼����� �ۼ��ڸ��� ����϶�.
 * �޼��� : hello
 * �ۼ��ڸ� : terry
 * 
 * hello from terry.
 */

//String msg = "", name = "";

		/*
		 * System.out.print("�޼��� : "); msg = sc.nextLine(); System.out.print("�ۼ��ڸ� : ");
		 * name = sc.nextLine();
		 * 
		 * Paper paper = new Paper(); paper.setMsg(msg); paper.setWritterName(name);
		 
		
		System.out.printf("\n%s from %s.", paper.getMsg(), paper.getWritterName());*/