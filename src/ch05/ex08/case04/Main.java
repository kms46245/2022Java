package ch05.ex08.case04;

public class Main {
	public static void main(String[] args) {
		//Deposit deposit = new Deposit();		
		//System.out.println(deposit.getBalance()); // �⺻ ������
		
		Deposit deposit = new Deposit();
		System.out.println(deposit.getBalance()); // Ư������ ������
		
		deposit = new Deposit(2000, 1000);
		System.out.println(deposit.getBalance()); // vip���� ������
	}
}
