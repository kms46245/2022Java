package ch02.ex02;

public class C05SB {
	public static void main(String[] args) {
		StringBuffer src = new StringBuffer("�츮 ���� ");
		
		int len = src.length();		// length(buffer�� ����)
		System.out.println("length : " + len);
		
		//System.out.println(src);
		
		src.append("¢�´�. ");		// append(buffer����)
		//System.out.println(src);
		src.replace(3, 4, "�����"); 	// replace(bufferġȯ)
		System.out.println(src);
		
		String str = src.toString(); // buffer�� string����
		System.out.println(str);
		
	}

}
