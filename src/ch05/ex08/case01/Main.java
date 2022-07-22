package ch05.ex08.case01;

public class Main {
	public static void main(String[] args) {
		Baby baby = new Baby();
		// 객체를 만들때(new) 불러오는 것이 바로 생성자다.
		// method call - 1. class.method - static
		//               2. 객체.method - instance
		//               3. new.생성자 - 생성자
		baby.setName("초롱이");
		
		Baby baby2 = new Baby("튼튼이");
	}
}
