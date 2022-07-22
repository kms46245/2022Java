package ch06.home.ex04.case03;

public class Circle{	
	private int r;
	private Dot dot;
	
	public Circle(Dot dot, int r) {
		//this.dot = new Dot(x, y);	// x,y 값을 받을때부터 dot의 객체로 받아버리면 더 간단해진다.
		this.dot = dot;
		this.r = r;
	}
	
	@Override
	public String toString() {
		return String.format("%s, %d", this.dot, this.r);
	}
}
