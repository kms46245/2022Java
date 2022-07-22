package ch06.home.ex04.case03;

public class Main {
	public static void main(String[] args) {
		Circle circle = new Circle(new Dot(1,2), 3);
		
		System.out.println(circle);
	}
}
// 과제] 점을 상속받는 원의 좋지않은 code를 refactoring 하라
// 힌트) circle에서 상속받은 x,y도 이미 중복이기때문에 좋지못하다