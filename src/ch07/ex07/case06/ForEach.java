package ch07.ex07.case06;

import java.util.ArrayList;
import java.util.List;

public class ForEach {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		for(int i = 1; i <= 3; i++) list.add(i);
		
		list.forEach(x -> System.out.print(x + " ")); // foreach를 통해 람다를 열어줄수 있다.
		
		System.out.println();
		//과제] forEach()로, 원소값이 짝수이면 출력하라.
		
		list.forEach(y -> 	{
			if(y % 2 == 0) System.out.println(y + " ");
		});
	}
}
 