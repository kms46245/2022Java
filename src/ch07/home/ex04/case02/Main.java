package ch07.home.ex04.case02;

public class Main {
	public static void main(String[] args) {
		Card[] cards = new Card[5];
		
		for(int i = 0; i < cards.length; i++)
			cards[i] = new Card(i);
		
		for(Card card : cards) System.out.print(card + " ");
		
		System.out.println();
				
		for(int i = 0; i < 100; i++) {
			int idx = (int)(Math.random() * 4 ) + 1;	//card counting
			
			Card temp = cards[0];
			cards[0] = cards[idx];
			cards[idx] = temp;
		}
		
		for(Card card: cards) System.out.print(card + " ");
	}
}
/* 과제]
 * ch07.ex04.case02.Shuffle을 OOP로 refactoring 하라.
 */
