package ch07.ex07.case03;

public class Main {
	public static void main(String[] args) {
		// ����) calculator�� lamda ���� �Ҵ��϶�.
		Calculator calc = (int x, int y) ->	{
			int result = x + y;
			return result;
		};  // traditional
		
		calc = (a ,b) -> a + b; // now
		
		System.out.println(calc.Calc(1, 2));
	}
}
