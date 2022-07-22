package ch07.ex05.case10;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Bumblebee bumblebee = new Bumblebee();
		Prime prime = new Prime();
		List<Autobot> corps = new ArrayList<>();
		
		corps.add(bumblebee);
		corps.add(prime);
		
		for(Autobot autobot : corps) {
			autobot.run();
			autobot.fight();
			//autobot.protect(); // 원소의 고유메서드를 리스트에서 호출할수없다.
			
			// 조건문으로 해당 인스턴스에 맞는지 확인한후 캐스팅을 통해 고유 메서드를 불러온다.
			if(autobot instanceof Bumblebee) ((Bumblebee)autobot).protect();
			if(autobot instanceof Prime) ((Prime)autobot).command();
		}
	}
}
