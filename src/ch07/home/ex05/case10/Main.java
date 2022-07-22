package ch07.home.ex05.case10;

//import java.util.ArrayList;
//import java.util.List;

public class Main {
	public static void main(String[] args) {
		Pencil pencil = new Pencil();
		Eraser eraser = new Eraser();
		Bag<Stationery> bag = new Bag<>();
		//List<Stationery> bag = new ArrayList<>();		// 클래스를 만들고 제네릭타입을 이용하면 조금더 고도화해서 작성이 가능하다.
				
		
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
 * 가방에 연필과 지우개를 담는다.
 * 가방에서 물건을 꺼낸다.
 * 꺼낸 물건이 연필이면, 필기(write)한다.
 * 지우개면 지운다(erase)
 */
