package ch06.ex06.case09;

public class Main {

	public static void main(String[] args) {
		Console console = new Console();
		Browser browser = new Browser();
		
		console.out();	// instance method - ��ü�� ȣ��
		browser.out();
		
		UI.in();        // static method - �������̽����� ȣ��
	}
}
