package ch07.ex07.case02;

@FunctionalInterface  // method�� interface�� = ���ٸ� ����Ѵ�
public interface Human { // default/static method�� ����
	void say();
	
	static void walk() {
		System.out.println("Human walk");
	}
	
	default void sleep() {
		System.out.println("Human sleep");
	}
}
