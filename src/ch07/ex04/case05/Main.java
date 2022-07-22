package ch07.ex04.case05;

import ch07.ex04.case05.Presentation.ScoreIo;
import ch07.ex04.case05.dao.ScoreDao;
import ch07.ex04.case05.dao.ScoreDaoImpl;
import ch07.ex04.case05.domain.Score;
import ch07.ex04.case05.service.ScoreService;
import ch07.ex04.case05.service.ScoreServiceImpl;

public class Main {
	public static void main(String[] args) {
		Score[] scores = new Score[5];
		/*
		for(int i = 0; i < scores.length; i++)
			scores[i] = new Score((i+1) * 10, (i+1) * 10, (i+1) * 10);
		*/
		
		ScoreDao scoreDao = new ScoreDaoImpl(scores);
		ScoreService scoreService = new ScoreServiceImpl(scoreDao);
		ScoreIo scoreIo = new ScoreIo(scoreService);
		
		scoreIo.play();		
	}
}
