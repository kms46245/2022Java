package ch08.ex03.case01;

public class C02Try {
		@SuppressWarnings("unused")
		public static void main (String []args) {
			int[] arr = new int [10];
			
			try {
					int result = arr [10];
		}catch(ArrayIndexOutOfBoundsException e) {
					System.out.println("예외가 발생했습니다.");
		}
			
			System.out.println("끝.");
	}
}
