package ch07.ex05.case01;

//Generic type = 타입을 임의로 선택해 기생하는 클래스의 범주내에서 활용가능
public class Basket<E> {
	private E e;
	
	public E get() {
		return this.e;
	}
	
	public void set(E e) {
		this.e = e;
	}
}
