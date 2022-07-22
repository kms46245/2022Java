package ch07.ex04.case05;

public class DoubleArray {
	public static void main(String[] args) {
		int[][] scores = {
			{90, 90, 90}, {20, 20, 20}, {30, 30, 30},
			{40, 40, 40}, {50, 50 ,50}
		};
		
		System.out.println("번호   국어  영어  수학   합계  평균");
		System.out.println("----------------------------");
		
		for(int i = 0; i < scores.length; i++) {
			int sum = 0;
			double avg = 0.0;
			
			System.out.print(" "+ (i + 1) + " ");
			for(int j = 0; j < scores[0].length; j++) {
				sum += scores[i][j];
				System.out.printf("%5d", scores[i][j]);
			}			
			avg = sum / scores[0].length;
			System.out.printf(" %5d %3.0f\n", sum, avg);
		}
	}
}

//table = record(가로값) + calumn(세로값) 라고 가정한다