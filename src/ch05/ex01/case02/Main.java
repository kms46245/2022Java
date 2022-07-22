	package ch05.ex01.case02;

public class Main {
	public static void main(String[] args) {
		String name = "최한석";
		int age = 35;
		System.out.printf("%s는 %d살입니다.\n", name, age);
		
		User user = new User();
		user.name = "최한석";
		user.age = 35;
		System.out.printf("%s는 %d살입니다.\n", user.name, user.age);
	}
}
