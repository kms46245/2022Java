package ch02.home.ex01;

public class H01Replacement {
	public static void main(String[] args) {
		/*
		int a = 1;
		int b = 2;
		int rep = 0;
		
		System.out.printf("a = %d\n = %d\n", a, b);
		
		rep = a;	// �߰������� a������
		a = b;		// b�� a�� ����
		b = rep;	// a�� ������ �߰����� b�� ����
		
		System.out.printf("a = %d\nb = %d\n", a, b);
		*/
		int a = 1;
		int b = 2;
		
		int temp = 0;
		
		temp = a;
		a = b;
		b = temp;
	}
	/*����] �κ����� �����͸� ��ü�϶� 
	       a = 1 b = 2
	       a = 2 b = 1 
	 */
}
