package ch07.ex04.case04;

public class Main {

	public static void main(String[] args) {
		Slot slot = new Slot();
		Ball[] balls = new Ball[6];
		
		
		for(int i = 0; i < 6; i++) {		// 뽑는 횟수
			balls[i] = slot.chuck();
		}
		
		for(Ball ball: balls)
			System.out.print(ball.getNum() + " "); // 중복값이 나오게되는 버그
	}
}
// 과제] 중복값이 나오게되는 버그를 제거하라