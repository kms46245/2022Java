package ch02.ex01;

public class C02Output {
	public static void main(String[] args) {
		int score = 100;
		System.out.println(100); // parameter���� 100����
		System.out.println(score); // parameter���� score��
		System.out.println(100 + 1); // parameter���� expression(����)����
		System.out.println(Math.random()); // parameter���� method��
		
		System.out.print(200);
		System.out.print(300);
		System.out.print("\n"); // �ٹٲ�
		System.out.println(400);
		// System.out.print("\s"); // ĭ ���
		 
		
		System.out.printf("%b %c %d %f %s\n", true, 'a', 10, 1.15, "hello");
		// ����1] �� ��¹����� �����ڷ� / �� ����ϼ���.
		System.out.printf("%b/%c/%d/%f/%s\n", true, 'a', 10, 1.15, "hello");
		System.out.printf("%5b|%-5c|%5d|%5.2f|%5s\n", true, 'a', 10,  1.15, "hello");
		// ����� ���������� ������ ��������
		System.out.printf("%5b|%-5c|%5d|%.2f|%5s\n", true, 'a', 10,  1.15, "hello");
		// f���� �Ҽ��� �ڸ����� ����
		
		String name = "��μ�";
		int age = 29;
		System.out.printf("%s %d\n", name,age);
		System.out.printf("%s�� %d���Դϴ�.\n", name,age);
		System.out.println(name + "�� " + age + "���Դϴ�.\n");
	}
}
