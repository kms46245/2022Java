package ch02.ex02;

public class C03Str {
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		int c = 3;
		int sum = a + b + c;
		
		System.out.printf("sum: %d\n", sum);
		
		String sumStr = "" + sum;	// 정수인 변수를 문자열로 변환
		System.out.printf("sum: %s\n", sumStr);
		
		String S = "" + (a + b); // 변수가 아니더라도 변환 가능
		//String S = "" + a + b; // 주의) 연산 순서에 맞게 위치를 조절하거나 소괄호를 이용해서 우선순위설정
		System.out.printf("sum: %s\n", S);
		
		String dialog = "John said, \"hello\"";
		System.out.printf("%s\n", dialog);
		
	}
	
}
