package ch02.ex02;

public class C05SB {
	public static void main(String[] args) {
		StringBuffer src = new StringBuffer("우리 개는 ");
		
		int len = src.length();		// length(buffer의 길이)
		System.out.println("length : " + len);
		
		//System.out.println(src);
		
		src.append("짖는다. ");		// append(buffer결합)
		//System.out.println(src);
		src.replace(3, 4, "고양이"); 	// replace(buffer치환)
		System.out.println(src);
		
		String str = src.toString(); // buffer를 string으로
		System.out.println(str);
		
	}

}
