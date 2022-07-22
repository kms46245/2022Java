package ch07.ex01.case04;

public class Main {
	public static void main (String []args) {
		Platanus platanus = new Platanus ();
			
		Tree tree = new Platanus();
		platanus = (Platanus)tree;
		
		tree = platanus;	// 자식에서 부모로 프로모션
		tree = (Tree)platanus;
	}
}
