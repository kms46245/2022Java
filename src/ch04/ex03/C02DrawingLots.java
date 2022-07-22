package ch04.ex03;

public class C02DrawingLots {
	public static void main(String[] args) {
		int random = 1;
		int pickCnt = 0;
		
		while(random % 3 != 0) {
			random = (int)(Math.random() * 100) + 1;
			pickCnt++;
			System.out.printf("%d\n",random);
		}
		
		System.out.printf("%d회 뽑아서, %d를 찾았습니다.",pickCnt, random);
	}
}
/*
 3의 배수를 뽑을 때까지, 계속 뽑는다.
 ->3의 배수가 아니면 뽑는다. 
 */
