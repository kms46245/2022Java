package ch02.ex03;

public class C02DoubleInt {
	public static void main(String[] args) {
		double d = 1.52;
		//double d2 = 1.62;
		int i = (int)d;
		System.out.printf("%d, %.2f\n", i, d);
		
		double f = Math.floor(d);	// ����
		double r = Math.round(d);	// �ݿø�
		//double r2 = Math.round(d2);	// ''
		//System.out.printf("%.2f, %.2f, %.2f\n", f, r, r2);
		System.out.printf("%.2f, %.2f\n", f, r);
		
	}

}
