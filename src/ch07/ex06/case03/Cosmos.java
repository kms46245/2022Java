package ch07.ex06.case03;

public class Cosmos {
	public static Animal getAnimal(String animalName) { // factory method
		Animal animal = null;
		
		switch(animalName) {
		case "È£¶ûÀÌ": animal = new Tiger(); break;
		case "¸Å" : animal = new Falcon();
		}
		return animal;
	}
}
