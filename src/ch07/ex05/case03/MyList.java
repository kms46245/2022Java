package ch07.ex05.case03;

import java.util.ArrayList;

public class MyList {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(1);	// 첫번째 value와 네번째 value가 같더라도 고유의 key가 다르기에 다른판정이다
		
		System.out.println(list);
		//리스트 자체는 Integer 타입이지만 value의 int형이 자동으로 바뀜 - AutoBoxing
		
		for(int i: list) System.out.print(i + " ");
		System.out.println();
		
		System.out.println(list.get(0));	// key값을 이용해 불러온다
		
		for(int i = 0; i < list.size(); i++) 
			System.out.print(list.get(i) + " ");
		
		System.out.println();
		
		
		for(int i = 0; i < list.size(); i++)
			 System.out.print(list.remove(i) + " ");
		//remove의 algorithm이 해당 배열의 value를 지우고 value의 칸을 한칸씩 당긴다
		 
		
		// 과제] remove를 이용하여 list의 모든 원소를 삭제하라.
		for(int i = list.size()-1; i >= 0; i--)
			System.out.println(list.remove(i) + " ");
		
		System.out.println(list);
	}
}
