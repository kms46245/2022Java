package ch05.ex08.case04;

public class Main {
	public static void main(String[] args) {
		//Deposit deposit = new Deposit();		
		//System.out.println(deposit.getBalance()); // 기본 생성자
		
		Deposit deposit = new Deposit();
		System.out.println(deposit.getBalance()); // 특정구좌 생성자
		
		deposit = new Deposit(2000, 1000);
		System.out.println(deposit.getBalance()); // vip구좌 생성자
	}
}
