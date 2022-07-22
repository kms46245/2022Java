package ch07.ex06.case05;

public class Box { // generic method
	public<T> T getLastVal(T[] arr) {
		return arr[arr.length - 1]; // 파라미터로 배열을 받고 마지막 index값을 리턴한다.
	}
}
