package ch02.home.ex01;

import java.util.Scanner;

public class H02Replacemnet {
	public static void main(String[] args) {
	
	/*Scanner sc = new Scanner(System.in);
	System.out.print("A�� �� ���� �Է��ϼ���.\n>");
	int i = sc.nextInt();
	System.out.print("B�� �� ���� �Է��ϼ���.\n>");
	int j = sc.nextInt();

	System.out.printf("�Էµ� ��\nA : %d\nB : %d\n",i , j);
	
	int tmp = 0;
	tmp = i;
	i = j;
	j = tmp;
	
	System.out.printf("��ü�� ��� ��\nA : %d\nB : %d\n",i , j);
	*/
		
	Scanner sc = new Scanner(System.in);
	
	// presentation logic(ȭ�鿡 ��µǴ� logic)
	System.out.print("a: ");	
	int a = sc.nextInt();
	System.out.print("b: ");
	int b = sc.nextInt();
	System.out.printf("=> a: %d, b : %d\n", a, b);
	
	System.out.println("=> a, b ���� ��ü�մϴ�.");
	// business logic (ȭ�鿡 ��µ����ʰ� �۾��ϴ� logic)
	int temp = 0;
	temp = a;
	a = b;
	b = temp;
	System.out.printf("=> a: %d, b: %d\n", a, b);
	
	}
}
/*  ����] a,b ������ ���� ��ü�϶�
	a�� b�� ���� ���Ƿ� �Է� �޴´�
	��ü ����� ����Ѵ�. */