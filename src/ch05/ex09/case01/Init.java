package ch05.ex09.case01;

public class Init {
	@SuppressWarnings("unused")
	private static int s;
	@SuppressWarnings("unused")
	private int i;
		
	static {
		Init.s = 1;
		//this.i = 1;		// this��� ���� ��ü�� ���⶧���� error (i�� ���������ʴ´�)
		System.out.println("static{}");
	}

	// �޼ҵ尡�ƴ� Ŭ�������� �ؾ� �ʱ�ȭ���̴� ������ �޼ҵ� �ȿ��� ������ ���� �׳� blockó���Ѱ��̴�.
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
	//instance block�� �����ڰ� ��� �����ϵ� ���� ���� �Ǿ����⶧���� �̿��Ѵ�.
	public Init(int i) {
		Init.s = 1;
		this.i = i;
		System.out.println("Init(int)");
	}
}
