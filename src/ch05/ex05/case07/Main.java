package ch05.ex05.case07;

public class Main {
	public static void main(String[] args) {
		Farmer farmer = new Farmer();
		Retailer retailer = new Retailer();
		
		retailer.Sell(farmer.Sell(1000));
		
	}
}
/*����] �̾߱⸦ ������Ѻ���
��ΰ� ����ϳ��� ��Ȯ�Ѵ� -> õ���� ������ �Űܼ� ������ڿ��� -> ������ڴ� �� 2��
retail.sell�� ȣ���Ѱ��� ������ �����Ѵ� */