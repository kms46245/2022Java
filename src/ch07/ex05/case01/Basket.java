package ch07.ex05.case01;

//Generic type = Ÿ���� ���Ƿ� ������ ����ϴ� Ŭ������ ���ֳ����� Ȱ�밡��
public class Basket<E> {
	private E e;
	
	public E get() {
		return this.e;
	}
	
	public void set(E e) {
		this.e = e;
	}
}
