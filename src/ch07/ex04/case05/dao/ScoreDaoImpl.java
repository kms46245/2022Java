package ch07.ex04.case05.dao;

import ch07.ex04.case05.domain.Score;

public class ScoreDaoImpl implements ScoreDao{
	private Score[] scores;
	private int cursor;
	
	public ScoreDaoImpl(Score[] scores) {
		this.scores = scores;
	}
	
	@Override
	public void insertScore(Score score) {	// �ڽ�Ŭ�������� �ޱ����� �θ�Ŭ���� �̻��� ���������ڸ� �����Ѵ�
		this.scores[cursor++] = score;		// ������ �θ�Ŭ������ public�̹Ƿ� public���� ����
	}
	
	@Override
	public Score[] selectScores(){
		return this.scores;
	}
 }
