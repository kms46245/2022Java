package ch07.ex04.case06;

public class Main {
	public static void main(String[] args) {
		Animal[] animals = new Animal[3];	// �������̽� Ÿ���� �迭�� ������ �� �ִ�.
		
		animals[0] = new Cat("����");
		animals[1] = new Dog("�ʺ�");
		animals[2] = new Dog("����");
		
		for(Animal animal: animals)	// �������̽� Ÿ������ ���θ��
			System.out.println(animal);
		
		Object[] objs = new Object[3];	// Object�� �̿��� ��� Ÿ���� �ѹ��� �������� �ִ�.
		objs[0] = new Cat("�����");		// ���������� ������Ʈ Ÿ������ ���θ��
		objs[1] = new Dog("�п���");
		objs[2] = new Cat("����");
		
		for(Object obj: objs)
			System.out.println(obj);
	}
}
