package ch07.ex06.case07;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Pocket pocket = new Pocket();
		List<Number> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		List<Double> list3 = new ArrayList<>();		// Number - int double 의 상속시킨 부모
		List<String> list4 = new ArrayList<>();		// string - 상속받지않은 단일형
		
		list1.add(1); list1.add(2);
		list2.add(1); list2.add(2);
		list3.add(1.0); list3.add(2.0);
		list4.add("a"); list4.add("b");
		
		pocket.printList(list1); // wildcard를 이용했기때문에 모든 type에 맞게 출력됐다.
		pocket.printList(list2);
		pocket.printList(list3);
		pocket.printList(list4);
		
		System.out.printf("%.1f\n%.1f\n%.1f\n", 
				pocket.add(list1),
				pocket.add(list2),
				pocket.add(list3));
		//pocket.add(list4); //number이하에 해당되지않은 string이므로 error
		
		pocket.add2(list1);
		pocket.add2(list2);
		//pocket.add2(list3); // integer이상에 해당되지않는 double이므로 error
		//pocket.add2(list4); // string도 마찬가지
	}
}
