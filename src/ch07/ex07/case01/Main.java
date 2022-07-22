package ch07.ex07.case01;

public class Main {
	public static void main(String[] args) {
		Human human = () -> System.out.println("hello"); // say method가 human 객체에 저장됐다.
		human.say();
	}
}
