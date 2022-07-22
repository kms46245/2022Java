package ch06.home.ex04.case03;

public class Dot {
	private int x;
	private int y;
	
	public Dot(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		return String.format("(%d, %d)", x, y);
	}
}
