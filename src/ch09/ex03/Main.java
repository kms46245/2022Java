package ch09.ex03;

public class Main {
	public static void main(String[] args) {
		Counter counter = new Counter();
		new Player(counter).start();	// 값을 공유한 상태로 여러 쓰레드가 그값을 가져갔기때문에
		new Player(counter).start();	// 결국 해당값이 오염되고만다.
		new Player(counter).start();
		new Player(counter).start();
		new Player(counter).start();
		// synchronized를 사용한 이후엔 값이 오염되지않았다(상대적으로)
	}
}
