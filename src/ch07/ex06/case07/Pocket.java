package ch07.ex06.case07;

import java.util.List;

@SuppressWarnings({ "removal", "unused" })
public class Pocket {
	{
		int i = 1 * 2;
		double d = 1.0 * 2.0;
		i = new Integer(1) + new Integer(2);
		d = new Double(1.0) + new Double(2.0);
		
		//new Number(1) * new Number(2);
	}
	
	// unbounded wildcard <?>
	public void printList(List<?> list) {
		System.out.println(list);
	}
	
	// upper bounded wildcard (~이하)
	public double add(List<? extends Number> list) { // wildcard에서 extends로 상한선
		double sum = 0;
		for(Number n : list) // 모든 숫자형 타입을 아우르는 number를 이용하면 어떤값이든 promotion이된다.
			sum += n.doubleValue(); // double형으로 받아서 sum에 추가
		return sum;
	}
	
	// lower bounded wildcard (~이상)
	public List<? super Integer> add2(List<? super Integer> list) {// wildcard에서 super로 하한선
		return list;	
	}
}
