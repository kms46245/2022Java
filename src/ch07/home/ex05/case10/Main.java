package ch07.home.ex05.case10;

//import java.util.ArrayList;
//import java.util.List;

public class Main {
	public static void main(String[] args) {
		Pencil pencil = new Pencil();
		Eraser eraser = new Eraser();
		Bag<Stationery> bag = new Bag<>();
		//List<Stationery> bag = new ArrayList<>();		// Ŭ������ ����� ���׸�Ÿ���� �̿��ϸ� ���ݴ� ��ȭ�ؼ� �ۼ��� �����ϴ�.
				
		
		bag.add(pencil);
		bag.add(eraser);		
		
		for(Stationery stat : bag)	{
			if(stat instanceof Pencil)
				((Pencil)stat).write();
			if(stat instanceof Eraser)	
				((Eraser)stat).erase();
		}
	}
}

/*
 * ���濡 ���ʰ� ���찳�� ��´�.
 * ���濡�� ������ ������.
 * ���� ������ �����̸�, �ʱ�(write)�Ѵ�.
 * ���찳�� �����(erase)
 */
