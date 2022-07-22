package ch07.ex05.case05;

import java.util.ArrayList;
import java.util.List;

public class Main2 {
	public static void main(String[] args) {
		List<Cat> floor1 = new ArrayList<>();
		List<Cat> floor2 = new ArrayList<>();
		List<List<Cat>> house = new ArrayList<>();
		
		for(int i = 0; i < 3; i++) {
			floor1.add(new Cat("�����" + i));
			floor2.add(new Cat("�߿���" + i));
		}
		
		System.out.printf("%s\n%s\n", floor1, floor2);
		
		house.add(floor1);
		house.add(floor2);
		System.out.println(house);
		
		//����] ����� ������������ ���� ���̼���.
		for(List<Cat> floor: house)
			for(Cat cat : floor) cat.eat();
		
		for(int i = 0; i < 3; i++) {
			floor1.get(i).eat();
			floor2.get(i).eat();
		}
		 
		for(int i = 0; i < 2; i++)
			for(int j = 0; j < 3; j++)
				house.get(i).get(j).eat();
	}
}
