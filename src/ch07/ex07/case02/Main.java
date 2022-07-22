package ch07.ex07.case02;

public class Main {
	public static void main(String[] args) {
		Human human = () -> System.out.println("human say");
		human.say();
		Human.walk();   // static method
		//human.walk(); // 유일하게 들어간 say method가 있기때문에 static은 객체로써 받을수 없다.
		human.sleep();  // default method는 작동된다.
		
		human = new Student();
		human.say();    // 상속받은 student의 say가 작동한다.
		//human.walk(); // student에서는 상속받지않았기때문에
		human.sleep();  // default는 상속 받았기때문에 가능하다.
	}
}
