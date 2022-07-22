package ch07.ex05.case06;

import java.util.HashSet;
import java.util.Set;

public class MySet {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(1); // list와 같이 컴파일에러는 발생하지않는다.
		
		System.out.println(set); // 중복된 값을 알아서 걸러서 버린다.
	}
}
