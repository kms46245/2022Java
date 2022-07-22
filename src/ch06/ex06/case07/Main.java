package ch06.ex06.case07;

public class Main {
	public static void main(String[] args) {
		int val = 1; // interface는 입력된 상수가 뭔지 파악하기 쉬워진다.
		
		switch(val) {
		case 1:
		case 2:
		}		
		
		switch(val) {	// 인터페이스를 사용하면 가독성이 좋아진다.
		case Code.USER_ADD:
		case Code.USER_DEL:
		}
	}
}
