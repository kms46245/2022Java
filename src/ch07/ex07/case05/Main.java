package ch07.ex07.case05;

public class Main {
	public static void main(String[] args) {
		// parameter가 하나일땐 생략가능 (없거나 둘이상이면 () 있어야함)
		Janitor<Building> janitor1 = a -> System.out.println(a + ", 청소합니다.");
		Janitor<Car> janitor2 = b -> System.out.println(b + ", 청소합니다.");
		
		janitor1.claen(new Building());
		janitor2.claen(new Car());
		
		//janitor1.claen(new Car());      // data를 생성할때 빌딩객체로 정해졌으므로 불가
		//janitor2.claen(new Building()); // 위와 같은 이유로 X
	}
}
