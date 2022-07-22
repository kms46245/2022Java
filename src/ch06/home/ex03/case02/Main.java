package ch06.home.ex03.case02;

public class Main {
	public static void main(String[] args) {
		Actor actor = new Actor();
		Singer singer = new Singer();
		
		actor.Perform();
		singer.Perform();
	}
}
/* 과제]
 * 가수가 공연을 한다.
 * 배우가 공연을 한다.
 * 를 overriding 을 이용해서 표현하라
 */
