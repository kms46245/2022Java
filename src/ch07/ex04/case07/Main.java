package ch07.ex04.case07;

public class Main {
	public static void main(String[] args) {
		Animal[] animals = new Animal[3];
		
		animals[0] = new Cat();
		animals[1] = new Snake();
		animals[2] = new Snake();
		
		for(Animal animal: animals)
			animal.eat();
	}
}
