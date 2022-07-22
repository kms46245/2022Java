package ch02.ex03;

public class C01IntDouble {
	public static void main(String[] args) {
		int i = 1;
		double d = 0.0;
		
		d = i;		// promotion
		System.out.printf("%.2f, %d\n", d, i);
		
		d = (double)i;
		System.out.printf("%.2f, %d\n", d, i);

		//i = d;  //type mismatch
		i = (int)d;
		System.out.printf("%.2f, %d\n", d, i);
	}

}
