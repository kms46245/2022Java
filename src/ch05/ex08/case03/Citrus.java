package ch05.ex08.case03;

public class Citrus {			// 순서 - 멤버변수 -> 생성자 -> 일반메서드 -> getter/setter
	private String name;
	
	public Citrus() {
		//this.Citrus("레드향"); // error - new 생성자 문법에 위배
		//new Citrus("레드향");  // bug - 객체 자체가 2개로 만들어져서 메인에 생성된 첫번째 객체는 null값
		this("레드향");		   // this()를 통해서 기본생성자에서 다른생성자의 조건을 사용할수 있다.
	}

	public Citrus(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
