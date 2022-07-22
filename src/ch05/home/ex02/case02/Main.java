package ch05.home.ex02.case02;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Paper paper = new Paper();
		
		System.out.print("메세지 : ");
		paper.setMsg(sc.nextLine());
		System.out.print("작성자명 : ");
		paper.setWritterName(sc.nextLine());
		
		System.out.printf("\n%s from %s.", paper.getMsg(), paper.getWritterName());
	}
}
/*
 * 종이에 메세지와 작성자명을 기록하라.
 * 메세지 : hello
 * 작성자명 : terry
 * 
 * hello from terry.
 */

//String msg = "", name = "";

		/*
		 * System.out.print("메세지 : "); msg = sc.nextLine(); System.out.print("작성자명 : ");
		 * name = sc.nextLine();
		 * 
		 * Paper paper = new Paper(); paper.setMsg(msg); paper.setWritterName(name);
		 
		
		System.out.printf("\n%s from %s.", paper.getMsg(), paper.getWritterName());*/