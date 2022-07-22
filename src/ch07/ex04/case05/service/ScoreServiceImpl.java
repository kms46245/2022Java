package ch07.ex04.case05.service;

import ch07.ex04.case05.dao.ScoreDao;
import ch07.ex04.case05.domain.Score;

public class ScoreServiceImpl implements ScoreService{
	private ScoreDao scoreDao;
	
	public ScoreServiceImpl(ScoreDao scoreDao) {
		this.scoreDao = scoreDao;	// DI
	}
	
	public ScoreServiceImpl() {
		
	}
	
	@Override
	public void addScore(Score score) {
		scoreDao.insertScore(score);
	}
	
	@Override
	public Score[] getScores() {
		Score[] scores = scoreDao.selectScores();
		this.calcScore(scores);
		return scores;
	}
	
	private void calcScore(Score[] scores) {
		for(int i = 0; i < scores.length; i++) {
			scores[i].setSum(scores[i].getKorScore() +
					scores[i].getEngScore() + scores[i].getMathScore());
			scores[i].setAvg(scores[i].getSum() / 3);
		}
	}
	
}
