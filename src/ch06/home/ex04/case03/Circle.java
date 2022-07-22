package ch06.home.ex04.case03;

public class Circle{	
	private int r;
	private Dot dot;
	
	public Circle(Dot dot, int r) {
		//this.dot = new Dot(x, y);	// x,y ���� ���������� dot�� ��ü�� �޾ƹ����� �� ����������.
		this.dot = dot;
		this.r = r;
	}
	
	@Override
	public String toString() {
		return String.format("%s, %d", this.dot, this.r);
	}
}
