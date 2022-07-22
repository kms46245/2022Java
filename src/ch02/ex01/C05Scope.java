package ch02.ex01;

public class C05Scope {
	public static void main(String[] args) {
		int i = 0;
		
		//int i = 0;      // -> 같은 함수 내에서 같은 이름의 변수는 존재할수 X
		int j = 0;
		{
			int x = 0;
			int y = 0;
		}
		int x = 0;			// -> 함수가 끝나며 해당 변수의 메모리는 제거되었기에 다시 생성
	}
}
