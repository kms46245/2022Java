package ch07.ex04.case05.service;

import ch07.ex04.case05.domain.Score;

public interface ScoreService {
	void addScore(Score score);
	Score[] getScores();
}
