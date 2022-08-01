package ch05.ex06.case01;

public class Main {
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Man.say("I love java a lot.");
		//Man.tell(""); // instance변수는 바로 call이 불가
		
		Man man = new Man();
		man.tell("I love java little bit.");
		man.say("Hello"); //static변수도 가능은하지만 경고가 뜬다(쓰지않는것을 강조하는뜻)
	}
}
