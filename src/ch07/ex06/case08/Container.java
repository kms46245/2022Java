package ch07.ex06.case08;

import java.util.ArrayList;

@SuppressWarnings("serial")
public class Container<E> extends ArrayList<E> {
	public void contain(E things) {
		this.add(things);
	}
}
