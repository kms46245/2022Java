package ch09.ex01;

public class C01Counter {
	public static void main(String[] args) {
		System.out.println("main start.");
		
		Thread thread1 = new Thread(() -> {
			for(int i = 0; i < 10; i++)
				System.out.print(i + " ");
		});
	
		Thread thread2 = new Thread(() -> {
			for(char c = 'a'; c <= 'z'; c++)
				System.out.print(c + " ");
		});
		
		thread1.start();
		thread2.start();	// thread가 여럿이 실행될때 시간분할을하여 하나하나씩 실행하며 분배된다.
							// 이렇게 진행되기에 동시진행같은 효과를 준다.
		
		
		System.out.println("main end.");
	}
}
//process / thread 
//