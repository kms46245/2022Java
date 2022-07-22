package ch07.ex04.case05.test;

import ch07.ex04.case05.dao.ScoreDao;
import ch07.ex04.case05.dao.ScoreDaoImpl;
import ch07.ex04.case05.domain.Score;

public class ScoreDaoTest {
	public static void main(String[] args) {
		// 테스트코딩에는 자연스럽게 하드코딩이 들어갈수밖에없다.
		// 그러한 데이터를 fixture라고 부른다.
		Score score1 = new Score(100, 100, 100);
		Score score2 = new Score(50, 50, 50);
		
		Score[] scores = new Score[2];
		ScoreDao scoreDao = new ScoreDaoImpl(scores);
		
		scoreDao.insertScore(score1);
		scoreDao.insertScore(score2);	
		
		scores = (scoreDao.selectScores());
		for(Score score : scores) System.out.println(score);
	}
}
