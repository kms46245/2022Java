package ch04.ex01;

public class C04Condition {
	public static void main(String[] args) {
		int a = 3;
		if(0 < a && a < 4)	System.out.println("Good");

		//����] b����, 'a'�ʰ� 'c'�̸� ������ ���ϸ�, good�� ����϶�.
		char b = 'b';
		if('a' < b && b < 'c')	System.out.println("Good");
		
		int x = 0;
		int y = 0;
		if((x = 1 + 2) > 0 || (y = 1 - 2) > 0)	// or�����ڰ� ù ������ �����ϰ� �ٷ� �Ѿ�⿡ y ������ �ȵȴ�.
			System.out.printf("x : %d\ny : %d\n", x, y);
		
		//����] S���� he, HE, He, hE �߿� �ϳ��� �ɸ��� he�� ����϶�
		
		String s = "he"; boolean Con1 = s.equals("he"); boolean Con2 = s.equals("HE");
		boolean Con3 = s.equals("He"); boolean Con4 = s.equals("hE");
		  
		  
		if(Con1 || Con2 || Con3 || Con4) System.out.println("he");
		 
		
		s = "";
		if(s.equals("")) System.out.println("���� ����.");
		
		// ����] ���� ������, ���� �ִٸ� ���϶�.
		s = "Hello";
		if(!s.equals(""))	System.out.println("���� �ִ�.");
		
		boolean power = false;
		if(!power)
			System.out.println("������ �׽��ϴ�.");			
	}
}
