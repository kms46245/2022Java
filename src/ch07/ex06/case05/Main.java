package ch07.ex06.case05;

public class Main {
	public static void main(String[] args) {
		Box box = new Box();
		Integer[] arr1 = {1, 2, 3};
		String[] arr2 = {"a", "b", "c"};
		
		int i = box.getLastVal(arr1); // generic type이 integer로 결정되어 그에 맞는 type으로 리턴
		String s = box.getLastVal(arr2);
		
		System.out.printf("%d %s", i, s);
	}
}
