package ch06.ex03.case03;

public class Main {
	public static void main(String[] args) {
		Duck duck = new Duck();
		Hen hen = new Hen();
		
		System.out.println(duck);
		System.out.println(hen);	// 상속받지않았기에 주소값이 불러졌다
	}
}
