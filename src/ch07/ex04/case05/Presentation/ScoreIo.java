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
					Console.inNum("���������� �Է��ϼ���."),
					Console.inNum("���������� �Է��ϼ���."),
					Console.inNum("���������� �Է��ϼ���."));
			scoreService.addScore(score);
		}
		
		scores =  scoreService.getScores();
		
		Console.info("  ����    ����   ����   �հ�  ���");
		Console.info("----------------------------");
		for(Score score : scores)
			System.out.println(score);
	}
}
