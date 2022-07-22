package ch07.home.ex05.case05;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Slot slot = new Slot();
		List<Ball> balls = new ArrayList<>();
				
		for(int i = 0; i < 6; i++)
			balls.add(slot.Chuck()); 
		
		for(Ball ball: balls)
			//System.out.print(ball.getNum() + " ");
			System.out.print(ball + "");
	}
}
/*
ch07.ex04.case04 를 list로 refactoring하라

*/