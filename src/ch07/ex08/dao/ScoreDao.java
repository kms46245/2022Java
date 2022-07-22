package ch07.ex08.dao;

import java.util.List;

import ch07.ex08.domain.Score;

public interface ScoreDao {
	void insertScore(Score score); // 점수의 의미보다 data를 읽는다는 쪽
	List<Score> selectScores();
}
