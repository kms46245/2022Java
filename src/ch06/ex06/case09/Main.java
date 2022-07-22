package ch06.ex06.case09;

public class Main {

	public static void main(String[] args) {
		Console console = new Console();
		Browser browser = new Browser();
		
		console.out();	// instance method - 객체로 호출
		browser.out();
		
		UI.in();        // static method - 인터페이스에서 호출
	}
}
