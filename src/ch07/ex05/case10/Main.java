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
			//autobot.protect(); // ������ �����޼��带 ����Ʈ���� ȣ���Ҽ�����.
			
			// ���ǹ����� �ش� �ν��Ͻ��� �´��� Ȯ������ ĳ������ ���� ���� �޼��带 �ҷ��´�.
			if(autobot instanceof Bumblebee) ((Bumblebee)autobot).protect();
			if(autobot instanceof Prime) ((Prime)autobot).command();
		}
	}
}
