package ch06.ex02.case01;

public class A {
	@SuppressWarnings("unused")
	private int a;
	int b;			//default
	protected int c;
	public int d;
	
	@SuppressWarnings("unused")
	private void m1() {}		// method도 지정된다.
	void m2() {}
	protected void m3() {}
	public void m4() {}			
}
// access identifier