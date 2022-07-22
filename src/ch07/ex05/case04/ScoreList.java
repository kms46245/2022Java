package ch07.ex05.case04;

import java.util.ArrayList;
import java.util.List;

public class ScoreList {
	public static void main(String[] args) {
		List<Integer> score1 = new ArrayList<Integer>();
		List<Integer> score2 = new ArrayList<Integer>();
		List<List<Integer>> scores = new ArrayList<List<Integer>>();
		// arraylist를 이중으로 사용하여 이중배열과 비슷한 효과를 나타낸다
		
		for(int i = 0; i < 3; i++) {
			score1.add(80 + i);
			score2.add(90 + i);
		}
		System.out.printf("%s\n%s\n", score1, score2);
		
		scores.add(score1);	// scores에 성적 list를 넣는다
		scores.add(score2);
		
		System.out.println(scores);
	}
}
