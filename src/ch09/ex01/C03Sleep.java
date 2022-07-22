package ch09.ex01;

public class C03Sleep {
	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {
			System.out.print(i + " ");
			
			try {
				Thread.sleep(1000); // mil second 단위로 입력한만큼 잠시 멈추도록 요청한다.
			} catch(Exception e) {}
		}
	}
}
