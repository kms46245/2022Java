package ch05.ex08.case02;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		//User user1 = new User();	// 기본생성자 없기에 x -> user가 생성자를 하나라도 생성하면 자동생성x
									// 방법1. 도메인을 이용해서 자동생성 방법2. 기본생성자 자동생성되게 비우거나, 모든 생성자를 써주기
		User user1 = new User("최한석", 25, LocalDate.now());	// 내가 만든 생성자 대로 기본값이 적혀져있다.
		User user2 = new User();	// 기본생성자로 작동
		
		user2.setName("양승일");
		user2.setAge(35);
		user2.setRegDate(LocalDate.now());
		
		System.out.printf("%s %d %s\n",
				user1.getName(), user1.getAge(), user1.getRegDate());
		System.out.printf("%s %d %s",
				user2.getName(), user2.getAge(), user2.getRegDate());
	}
}
