package ch07.ex07.case05;

public class Main {
	public static void main(String[] args) {
		// parameter�� �ϳ��϶� �������� (���ų� ���̻��̸� () �־����)
		Janitor<Building> janitor1 = a -> System.out.println(a + ", û���մϴ�.");
		Janitor<Car> janitor2 = b -> System.out.println(b + ", û���մϴ�.");
		
		janitor1.claen(new Building());
		janitor2.claen(new Car());
		
		//janitor1.claen(new Car());      // data�� �����Ҷ� ������ü�� ���������Ƿ� �Ұ�
		//janitor2.claen(new Building()); // ���� ���� ������ X
	}
}
