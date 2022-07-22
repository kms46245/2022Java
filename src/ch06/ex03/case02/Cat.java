package ch06.ex03.case02;

public class Cat extends Animal{
	@Override	// annotation (@이 붙어있는 것은 컴파일러가 읽어 달라고 만드는 것)
	public void shout() {
		System.out.println("야옹");
	}
}
