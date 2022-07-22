package ch09.ex02;

public class Counter implements Runnable{ // method를 쓰레드화 시킬때엔 runnable을 상속받는다.
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + ": start.");
		
		for(char c = 'a'; c <= 'f'; c++){
			System.out.println(Thread.currentThread().getName() + ": " + c);
			try {
				System.out.println(Thread.currentThread().getName() + ": sleep.");
				Thread.sleep(1000);
			} catch(InterruptedException e) {
				System.out.println(Thread.currentThread().getName() + ": interrupted.");
			}
		}
		System.out.println(Thread.currentThread().getName()+  ": end.");
	}
}
