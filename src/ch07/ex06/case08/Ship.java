package ch07.ex06.case08;

import java.util.ArrayList;
import java.util.List;

public class Ship {
	private List<Container<?>> containers; // generic type을 현재 기점으로 정하지않았을때는 wildcard를 이용한다.
	
	public Ship() {
		containers = new ArrayList<>();
	}
	
	public void put(Container<?> container) {
		containers.add(container);
	}
}
