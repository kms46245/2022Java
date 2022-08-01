package ch05.home.ex05.case04;

import java.time.LocalDate;

public class Man {
	@SuppressWarnings("unused")
	private String name;
	@SuppressWarnings("unused")
	private int age;
	@SuppressWarnings("unused")
	private LocalDate birthDate;
	
	public void sing() {}
	public void eat() {}
	public void run() {}
	
		
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}
}