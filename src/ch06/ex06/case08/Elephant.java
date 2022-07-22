package ch06.ex06.case08;

public class Elephant implements Animal{	//이미 interface를 만든시점에서 정해진 알고리즘을 실행할수있게해준다. - default
	@Override
	public void move() {
		System.out.println("걸어가다.") ;
	}
}
