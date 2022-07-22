package ch05.ex09.case01;

public class Main {
	public static void main(String[] args) {
		new Init();
		new Init();	// byte code는 중복으로 로딩하지않기때문에 static{}은 다시로딩 하지않는다.
					// 이로써 알수 있는사실은, instance block이 먼저 실행되고 그다음 생성자가 실행된다.
		new Init(1);
		
	}			
}
