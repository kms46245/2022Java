package ch07.ex06.case03;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Animal> zoo = new ArrayList<>();
		zoo.add(new Tiger());	// 기존에 리스트에 생성하던 방식 / 낱개로 생성
		zoo.add(new Falcon());
		zoo.clear(); // 리스트내에 요소를 전부 초기화
		
		zoo.add(Cosmos.getAnimal("호랑이")); //factory method를 이용해 바로 찍어낸다.
		zoo.add(Cosmos.getAnimal("매"));
		
		for(Animal animal : zoo) {
			animal.eat();
			animal.move();
		}
	}
}
