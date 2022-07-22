package ch05.ex08.case04;

public class Deposit {
	private int balance;
	
	public Deposit() {			//기본 구좌 = 1000
		//this.balance = 1000;
		this(1000);
	}
	
	public Deposit(int principal) {	// 특정 구좌 = 금액입력
		this(principal, 0);
	}
	
	public Deposit(int principal, int interest) { // vip구좌 = 금액 + 이자
		this.balance = principal + interest + 100;
	}

	public int getBalance() {
		//return this.balance; // 생략하더라도 원래대로 잘 찾아준다
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
}
