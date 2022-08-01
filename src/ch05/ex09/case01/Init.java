package ch05.ex09.case01;

public class Init {
	@SuppressWarnings("unused")
	private static int s;
	@SuppressWarnings("unused")
	private int i;
		
	static {
		Init.s = 1;
		//this.i = 1;		// this라는 변수 자체가 없기때문에 error (i가 존재하지않는다)
		System.out.println("static{}");
	}

	// 메소드가아닌 클래스에서 해야 초기화블럭이다 이전에 메소드 안에서 생성한 것은 그냥 block처리한것이다.
	{
		Init.s = 1;
		this.i = 1;
		System.out.println("{}");
	}
	
	public Init() {
		Init.s = 1;
		this.i = 1;
		System.out.println("Init()");
	}
	//instance block은 생성자가 어떤게 실행하든 먼저 실행 되어지기때문에 이용한다.
	public Init(int i) {
		Init.s = 1;
		this.i = i;
		System.out.println("Init(int)");
	}
}
