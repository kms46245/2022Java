package ch05.ex05.case10;

public class Man {
	public void strip() {}
	public void wash() {}
	public void wear(Pajamas pajamas) {}
	public void lie() {}				// method 전체가 하나의 원하는 행동일때


	public void Sleep(Pajamas pajamas) {
		this.strip();
		this.wash();
		this.wear(pajamas);
		this.lie();
	}
}

