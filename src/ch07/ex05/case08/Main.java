package ch07.ex05.case08;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Dove dove = new Dove();
		Duck duck = new Duck();
		Lion lion = new Lion();
		Leopard leopard = new Leopard();
		
		List<Creeper> pen = new ArrayList<>();
		pen.add(lion);
		pen.add(leopard);
		//pen.add(duck); // Creeper타입의 ArrayList이므로 bird는 못들어간다
		
		List<Bird> cage = new ArrayList<>();
		cage.add(dove);
		cage.add(duck);
		//cage.add(lion); // 위와 같은 이유로 에러난다.
		
		for(Creeper creeper : pen) creeper.walk();
		for(Bird bird : cage) bird.fly();
	}
}
