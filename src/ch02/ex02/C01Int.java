package ch02.ex02;

public class C01Int {
	public static void main(String[] args) {
		int x = 10; // decimal
		System.out.println(Integer.toBinaryString(x)); // to binary
		
		x = 012; // octal(8)
		System.out.println(Integer.toBinaryString(x)); // to binary
		
		x = 0xA; // hexadecimal(16)
		System.out.println(Integer.toBinaryString(x)); // to binary
		
		x = 0b1010; // binary(2)
		System.out.println(Integer.toBinaryString(x)); // to binary
		
		x = 1_234_567; // literal에도 _를 쓸 수 있다(1000단위).
		System.out.println(x + 1);
		
		double y = 1e1;	// 지수
		System.out.println(y);
		
		
	}

}
