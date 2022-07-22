package ch05.ex05.case07;

public class Main {
	public static void main(String[] args) {
		Farmer farmer = new Farmer();
		Retailer retailer = new Retailer();
		
		retailer.Sell(farmer.Sell(1000));
		
	}
}
/*과제] 이야기를 진행시켜보자
농부과 사과하나를 수확한다 -> 천원의 가격을 매겨서 유통업자에게 -> 유통업자는 그 2배
retail.sell로 호출한것을 끝으로 간주한다 */