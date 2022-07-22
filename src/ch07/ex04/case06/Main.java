package ch07.ex04.case06;

public class Main {
	public static void main(String[] args) {
		Animal[] animals = new Animal[3];	// 인터페이스 타입의 배열은 생성할 수 있다.
		
		animals[0] = new Cat("산이");
		animals[1] = new Dog("똘비");
		animals[2] = new Dog("몽이");
		
		for(Animal animal: animals)	// 인터페이스 타입으로 프로모션
			System.out.println(animal);
		
		Object[] objs = new Object[3];	// Object를 이용해 모든 타입을 한번에 받을수도 있다.
		objs[0] = new Cat("헤롱이");		// 마찬가지로 오브젝트 타입으로 프로모션
		objs[1] = new Dog("왈왈이");
		objs[2] = new Cat("봄이");
		
		for(Object obj: objs)
			System.out.println(obj);
	}
}
