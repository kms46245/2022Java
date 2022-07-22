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
		 */		// 중복코드가 발생하므로 method 전체를 불러오면 중복이 줄어든다.
		
		man.Sleep(pajamas);
		man.Sleep(pajamas);
		man.Sleep(pajamas);	// 중복코드가 훨씬 줄어든다.
	}
}
