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
	
	// upper bounded wildcard (~����)
	public double add(List<? extends Number> list) { // wildcard���� extends�� ���Ѽ�
		double sum = 0;
		for(Number n : list) // ��� ������ Ÿ���� �ƿ츣�� number�� �̿��ϸ� ����̵� promotion�̵ȴ�.
			sum += n.doubleValue(); // double������ �޾Ƽ� sum�� �߰�
		return sum;
	}
	
	// lower bounded wildcard (~�̻�)
	public List<? super Integer> add2(List<? super Integer> list) {// wildcard���� super�� ���Ѽ�
		return list;	
	}
}
