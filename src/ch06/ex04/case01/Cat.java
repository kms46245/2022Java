package ch06.ex04.case01;

public class Cat extends Animal{
	private int age;
	
	public Cat(String name, int age) {
		//super();
		super(name);		        // �ڽ�Ŭ�������� ù�ٿ� ������ ���� -> �θ�Ŭ������ �����ڸ� ����¿���
		//this.name = name;			// �ڽ��� �Ӽ��� �ڽ��� �ʱ�ȭ �ϵ����Ѵ�.
		this.age =age;
	}
	
	public int getAge() {
		return this.age;
	}
}
