package ch09.ex02;

public class Main {
	public static void main(String[] args) throws InterruptedException{
		System.out.println(Thread.currentThread().getName() + ": start.");
		
		Thread counter = new Thread(new Counter());
		counter.start();
		
		int tries = 1;
		while(counter.isAlive()) {
			if(tries <= 2) {
				counter.join(1000); // main이 counter를 연결해서 작동시킨다 를 표현한다.
				System.out.println(Thread.currentThread().getName() + ": wait" + tries++);
			} else {
				System.out.println(Thread.currentThread().getName() + ": irritated");
				counter.interrupt(); // counter를 강제로 방해(sleep일때 깨우는 용도).
				counter.join();      // counter가 사라질때까지 지켜본다.
			}
		}
		
		System.out.println(Thread.currentThread().getName() + ": end.");
	}
}
