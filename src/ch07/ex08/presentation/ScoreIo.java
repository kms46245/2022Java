package ch07.ex08.presentation;

import java.util.List;

import ch07.ex08.domain.Score;
import ch07.ex08.service.ScoreService;

public class ScoreIo {
	private ScoreService scoreService;
	
	public ScoreIo(ScoreService scoreService) {
		this.scoreService = scoreService;
	}
	
	public void play(int num) {
		int korScore = 0; int engScore = 0; int mathScore = 0;
		
		for(int i = 0; i < num; i++) {
			korScore = Console.inNum("���� ������ �Է��ϼ���.");
			engScore = Console.inNum("���� ������ �Է��ϼ���.");
			mathScore = Console.inNum("���� ������ �Է��ϼ���.");
			
			Score score = new Score(korScore, engScore, mathScore);
			scoreService.addScore(score);
		}
		List<Score> scores = scoreService.getScores();
		for(Score score : scores) System.out.println(score);
	}
}