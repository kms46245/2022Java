package ch09.ex03;

public class Counter {
	private int val;
	
	public synchronized void increase() { // synchronized를 이용하면 먼저 사용한 쓰레드는 대기하게된다.(무분별한 쓰레드의 사용을 방지) 
		val++;
	}
	
	public synchronized void decrease() {
		val--;
	}
	
	public synchronized void print() {
		System.out.print(val + " ");
	}
}
