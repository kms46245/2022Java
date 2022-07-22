package ch04.ex03;

public class C03Lunch {
	public static void main(String[] args) {
		int calorie = 0;
		int food = 0;
		
		while(calorie < 30) {
			food = (int)(Math.random()* 10)+ 1;
			
			if(food % 5 == 0) {
				System.out.println("상한 음식을 뱉다.");
				break;
			}
			calorie += food;
		}
		System.out.println(calorie + "cal. 만큼 먹었습니다.");
	}
}
// 5의 배수인 경우 상했다 라고 표현한다.
// 30 칼로리이상인 경우 배부르다