package ch06.home.ex04.case03;

public class Main {
	public static void main(String[] args) {
		Circle circle = new Circle(new Dot(1,2), 3);
		
		System.out.println(circle);
	}
}
// ����] ���� ��ӹ޴� ���� �������� code�� refactoring �϶�
// ��Ʈ) circle���� ��ӹ��� x,y�� �̹� �ߺ��̱⶧���� �������ϴ�