package ch02.ex04;

public class C02Overflow {
	public static void main(String[] args) {
		//byte b = 128;
		byte b = 127;
		//b = b + 1;
		
		b++; // 증감연산자(에러없이 overflow가 진행됨)
		//b++;
		System.out.println(b);
	}

}
