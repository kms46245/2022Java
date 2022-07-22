package ch08.ex03.case01;

public class C05Hirearchy {
		public static void main (String[]args) {
			try {
					int i = 3 / 0;
			}catch(ArithmeticException e) {
				System.err.println("ArithmeticException 이 발생했습니다.");
			}catch (Exception e){
				System.out.println("Exception 이 발생했습니다.");
			}
		}
}
