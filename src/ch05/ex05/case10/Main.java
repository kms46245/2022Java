package ch05.ex05.case10;

public class Main {
	public static void main(String[] args) {
		Pajamas pajamas = new Pajamas();
		Man man = new Man();
		
		/*
		 * man.strip(); man.wash(); man.wear(pajamas); man.lie();
		 * 
		 * man.strip(); man.wash(); man.wear(pajamas); man.lie();
		 * 
		 * man.strip(); man.wash(); man.wear(pajamas); man.lie();
		 */		// �ߺ��ڵ尡 �߻��ϹǷ� method ��ü�� �ҷ����� �ߺ��� �پ���.
		
		man.Sleep(pajamas);
		man.Sleep(pajamas);
		man.Sleep(pajamas);	// �ߺ��ڵ尡 �ξ� �پ���.
	}
}
