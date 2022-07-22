package ch05.ex08.case04;

public class Deposit {
	private int balance;
	
	public Deposit() {			//�⺻ ���� = 1000
		//this.balance = 1000;
		this(1000);
	}
	
	public Deposit(int principal) {	// Ư�� ���� = �ݾ��Է�
		this(principal, 0);
	}
	
	public Deposit(int principal, int interest) { // vip���� = �ݾ� + ����
		this.balance = principal + interest + 100;
	}

	public int getBalance() {
		//return this.balance; // �����ϴ��� ������� �� ã���ش�
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
}
