package ch07.home.ex05.case05;

import java.util.ArrayList;
import java.util.List;

public class Slot {
	private List<Ball> balls;
	
	public Slot() {
		balls = new ArrayList<>();
		
		for(int i = 0; i < 45; i++)
			balls.add(new Ball(i + 1));
	}
	
	public Ball Chuck() {
		int i = (int)(Math.random() * balls.size());
		return balls.remove(i);
	}
	
	
	/*
	 * public Ball Chuck(int count) { int i = 0; Ball ball = null; Boolean isGood =
	 * false;
	 * 
	 * do { i = (int)((Math.random() * 45) - count); if(i > 0) { ball =
	 * balls.get(i); balls.remove(i); isGood = true; } else isGood = false;
	 * }while(isGood == false);
	 * 
	 * return ball; }
	 */
}
