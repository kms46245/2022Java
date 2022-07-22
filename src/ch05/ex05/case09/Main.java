package ch05.ex05.case09;

public class Main {
	public static void main(String[] args) {
		Cat cat1 = new Cat();
		cat1.setName("늠름이");
		
		Cat cat2 = cat1.breed(); // 새로생긴 객체를 지정해주면 클래스내에서 작업을 완료할 수 있다.
		cat2.setName("튼튼이"); 
	}
}
