package ch05.home.ex01.case04;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = "";
		int age = 0;
		LocalDate regDate = null;
				
		System.out.print("이름 : ");
		name = sc.nextLine();		
		System.out.print("나이 : ");
		age = sc.nextInt();
		regDate = LocalDate.now();
		
		User user = new User();
		user.setName(name);
		user.setAge(age);
		user.setRegistDay(regDate);
		
		System.out.print("\n이름 : " + user.getName() + "\n나이 : " + user.getAge() +
				"\n가입일 : " + user.getRegistDay());
	}
}

/*
 과제] 사용자를 생성하라.
  사용자의 이름, 나이를 수동 입력받는다.
  가입일은 오늘 날짜를 자동 입력받는다.
  ---------------
  이름: gambit
  나이: 25
  
  이름 : gambit
  나이 : 25
  가입일 : 2022-06-21
 */