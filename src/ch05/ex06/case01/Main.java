package ch05.ex06.case01;

public class Main {
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Man.say("I love java a lot.");
		//Man.tell(""); // instance������ �ٷ� call�� �Ұ�
		
		Man man = new Man();
		man.tell("I love java little bit.");
		man.say("Hello"); //static������ ������������ ��� ���(�����ʴ°��� �����ϴ¶�)
	}
}
