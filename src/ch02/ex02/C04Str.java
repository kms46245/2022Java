package ch02.ex02;

public class C04Str {
	public static void main(String[] args) {
		String src = "�츮 ���� ";
		String s1 = "";
		String s2 = "";
		String s3 = "";
		char c = 0;
		
		int len = src.length();
		System.out.println(len);
		
		s1 = src.concat("¢�´�.");		// concat (����)
		s2 = src.replace("��", "�����");	// replace(ġȯ)
		s3 = src.substring(0, 4); 		// substr (����)
		c = src.charAt(3);				// charAt (��������)
		
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(c);
		
		// charAt�� �̿��������� "��"���� �����ؼ� ��������
		String s4 = src.substring(3, 4);
		System.out.println(s4);
		
		
	}

}
