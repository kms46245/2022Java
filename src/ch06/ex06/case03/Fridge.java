package ch06.ex06.case03;

public class Fridge implements Appliance{	// extends�� ��Ӱ��� �ٸ��� �ʼ������� interface�� ��Ұ� �����Ѵ�.
	@Override
	public void on() {						// abstract�� �޸� method�� ������ �����Ѵ�.(�������� �����ʰԵǴ� ��츦 ���Ѵ�)
		System.out.println("����� �Ѵ�.");
	}	
	
	@Override
	public void off() {
		System.out.println("����� ����.");
	}
}
