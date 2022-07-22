package ch05.ex08.case02;

import java.time.LocalDate;

public class User {
	private String name;
	private int age;
	private LocalDate regDate;
				//지금동안 사용한 this는 컴파일러가 만들고 이런식으로 transparent 되있었다. 유저가 작성하면 작동X
	public User(/*User this,*/String name, int age, LocalDate regDate) {
		this.name = name;			// this - 데이터타입은 클래스의타입을 그대로 따라간다
		this.age = age;				// 해당 클래스 데이터타입의 객체가 들어있다. 이 작업을 VM이 자동으로 진행
		this.regDate = regDate;
	}
	
	public User() {}				// 기본생성자는 자동으로 만들어지는조건이 하나도없을때이므로 하나라도있으면 직접 만들어줘야한다.
	
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public LocalDate getRegDate() {
		return regDate;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setRegDate(LocalDate regDate) {
		this.regDate = regDate;
	}	
}
