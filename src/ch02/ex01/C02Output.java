package ch02.ex01;

public class C02Output {
	public static void main(String[] args) {
		int score = 100;
		System.out.println(100); // parameter값을 100으로
		System.out.println(score); // parameter값을 score로
		System.out.println(100 + 1); // parameter값을 expression(수식)으로
		System.out.println(Math.random()); // parameter값을 method로
		
		System.out.print(200);
		System.out.print(300);
		System.out.print("\n"); // 줄바꿈
		System.out.println(400);
		// System.out.print("\s"); // 칸 띄움
		 
		
		System.out.printf("%b %c %d %f %s\n", true, 'a', 10, 1.15, "hello");
		// 과제1] 위 출력문에서 구분자로 / 를 사용하세요.
		System.out.printf("%b/%c/%d/%f/%s\n", true, 'a', 10, 1.15, "hello");
		System.out.printf("%5b|%-5c|%5d|%5.2f|%5s\n", true, 'a', 10,  1.15, "hello");
		// 양수는 오른쪽정렬 음수는 왼쪽정렬
		System.out.printf("%5b|%-5c|%5d|%.2f|%5s\n", true, 'a', 10,  1.15, "hello");
		// f에서 소수점 자릿수에 주의
		
		String name = "김민석";
		int age = 29;
		System.out.printf("%s %d\n", name,age);
		System.out.printf("%s은 %d살입니다.\n", name,age);
		System.out.println(name + "은 " + age + "살입니다.\n");
	}
}
