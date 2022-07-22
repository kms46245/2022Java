package ch05.ex05.case03;

public class Main {
	public static void main(String[] args) {
		Calculator calc = new Calculator();

		int result = calc.add(1,2);		
		System.out.println(result);
		
		Paper paper = new Paper();
		paper.setA(1);
		paper.setB(2);
		paper = calc.add(paper);
		
		System.out.println(paper.getResult());
	}
}
