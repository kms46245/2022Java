package ch07.ex04.case05.dao;

import ch07.ex04.case05.domain.Score;

public class ScoreDaoImpl implements ScoreDao{
	private Score[] scores;
	private int cursor;
	
	public ScoreDaoImpl(Score[] scores) {
		this.scores = scores;
	}
	
	@Override
	public void insertScore(Score score) {	// 자식클래스에서 받기위해 부모클래스 이상의 접근제한자를 지정한다
		this.scores[cursor++] = score;		// 지금은 부모클래스가 public이므로 public으로 설정
	}
	
	@Override
	public Score[] selectScores(){
		return this.scores;
	}
 }
