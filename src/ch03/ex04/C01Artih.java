package ch03.ex04;

public class C01Artih {
	public static void main(String[] args) {
		byte a = 3;
		byte b = 2;
		//byte c = a + b;		// a + b의 합인 5의 값을 int로 읽기에 type mismatch
		byte c = (byte)(a + b);
		System.out.println(c);
		
		//c = c + 1; // 수식이 합연산을 하며 int type으로 바뀌기때문에 mismatch
		c++;		 //	단항연산자는 type을 바꾸지않는다.	
		System.out.println(c);
		
		double d = a / b;	// a / b를 계산하는 과정에서 overflow가 된채 int형이 되어 bug발생
		System.out.println(d);
		
		//d = ((double)a / (double)b);	// 계산하는 과정에서 int형이 되지않게 double로 형 선언
		d = (double)a / b;				// a가 double형으로 들어왔기때문에 b는 자동적으로 상위형인 double로 맞춰짐
		System.out.println(d);
		
		d = 1.0* a / b; //연산자없이도 선언된 상수의 형에 따라 가능하다.
		System.out.println(d);
		
		d = (double)(a / b);			// 나쁜예) 수식을 합치면서 수식을 먼저계산하며 int형으로 변환되어 overflow 
		System.out.println(d);
			
		d = a / b * 1.0;				// 나쁜예2) 수식이 먼저 계산되어서 int형으로 변환되어 overflow
		System.out.println(d);
		
	}
}

/* 과제)
byte c = a + b;의 컴파일 에러를 해결하라
*/