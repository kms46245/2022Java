package ch09.ex04;

public class Buffer {
	private Integer val;
	
	public synchronized int remove() {
		while(val == null) {
			try {
				wait();				// 쓰레드에게 대기하라고 지시
			} catch(InterruptedException e) {}
		}
		
		int val = this.val;
		//과제] 꺼냈다.를 표현하세요.
		this.val = null;
		
		notifyAll();  // 모든 쓰레드에 알림(interrupted)를 한다.
		
		return val;
	}
	
	public synchronized void add(Integer val) {
		while(this.val != null) {
			try {
				wait();
			} catch(InterruptedException e) {}
		}
		
		this.val = val;
		notifyAll();
	}
}
