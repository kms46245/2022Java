package ch07.ex07.case02;

public class Main {
	public static void main(String[] args) {
		Human human = () -> System.out.println("human say");
		human.say();
		Human.walk();   // static method
		//human.walk(); // �����ϰ� �� say method�� �ֱ⶧���� static�� ��ü�ν� ������ ����.
		human.sleep();  // default method�� �۵��ȴ�.
		
		human = new Student();
		human.say();    // ��ӹ��� student�� say�� �۵��Ѵ�.
		//human.walk(); // student������ ��ӹ����ʾұ⶧����
		human.sleep();  // default�� ��� �޾ұ⶧���� �����ϴ�.
	}
}
