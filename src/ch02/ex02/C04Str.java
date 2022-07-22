package ch02.ex02;

public class C04Str {
	public static void main(String[] args) {
		String src = "우리 개는 ";
		String s1 = "";
		String s2 = "";
		String s3 = "";
		char c = 0;
		
		int len = src.length();
		System.out.println(len);
		
		s1 = src.concat("짖는다.");		// concat (결합)
		s2 = src.replace("개", "고양이");	// replace(치환)
		s3 = src.substring(0, 4); 		// substr (추출)
		c = src.charAt(3);				// charAt (문자추출)
		
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(c);
		
		// charAt을 이용하지말고 "개"만을 추출해서 만들어내보자
		String s4 = src.substring(3, 4);
		System.out.println(s4);
		
		
	}

}
