package ch05.ex09.case01;

public class Main {
	public static void main(String[] args) {
		new Init();
		new Init();	// byte code�� �ߺ����� �ε������ʱ⶧���� static{}�� �ٽ÷ε� �����ʴ´�.
					// �̷ν� �˼� �ִ»����, instance block�� ���� ����ǰ� �״��� �����ڰ� ����ȴ�.
		new Init(1);
		
	}			
}
