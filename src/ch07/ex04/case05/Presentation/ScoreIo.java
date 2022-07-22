package ch07.ex04.case05.Presentation;

import ch07.ex04.case05.domain.Score;
import ch07.ex04.case05.service.ScoreService;

public class ScoreIo {
	private ScoreService scoreService;
	
	public ScoreIo(ScoreService scoreService) {
		this.scoreService = scoreService;
	}
	
	public void play() {
		Score[] scores = new Score[5];
			
		for(int i = 0; i < scores.length; i++) {
			Score score = new Score(
					Console.inNum("국어점수를 입력하세요."),
					Console.inNum("수학점수를 입력하세요."),
					Console.inNum("영어점수를 입력하세요."));
			scoreService.addScore(score);
		}
		
		scores =  scoreService.getScores();
		
		Console.info("  국어    영어   수학   합계  평균");
		Console.info("----------------------------");
		for(Score score : scores)
			System.out.println(score);
	}
}
