package ch07.ex04.case05.test;

import ch07.ex04.case05.domain.Score;
import ch07.ex04.case05.service.ScoreServiceImpl;

public class ScoreServiceTest {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		ScoreServiceImpl scoreService = new ScoreServiceImpl();
		
		Score[] scores = new Score[5];
		for(int i = 0; i < scores.length; i++)
			scores[i] = new Score((i+1) * 10, (i+1) * 10, (i+1) * 10);
		
		for(Score score : scores) System.out.println(score);
		
		//scoreService.calcScore(scores);
		System.out.println();
		for(Score score : scores) System.out.println(score);
		
	}
}
