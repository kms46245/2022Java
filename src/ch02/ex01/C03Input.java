package ch02.ex01;

import java.util.Scanner;		// �⺻ ��Ű���� ������ ����� �ƴϹǷ� �߰� (ctrl + shift + o)

public class C03Input {
	public static void main(String[] args)	{
		Scanner sc = new Scanner(System.in);
		/*System.out.print("���ڿ��� �Է��ϼ���.\n>");
		//����2] <�Էµ�����>�� �Է��߽��ϴ�. �� Ȯ�� �޼����� ����Ѵ�.
		String str = sc.nextLine();
		System.out.printf("%s�� �Է��߽��ϴ�.\n", str);
		*/
		
		/*System.out.print("���ڸ� �Է��ϼ���.\n>");
		int i = sc.nextInt();
		System.out.printf("%d��(��) �Է��߽��ϴ�.\n", i);
		
		System.out.print("���ڸ� �Է��ϼ���.\n>");
		int j = sc.nextInt();
		System.out.printf("%d��(��) �Է��߽��ϴ�.\n", j);
	
		System.out.print("���ڿ��� �Է��ϼ���.\n>");
		String str = sc.nextLine();
		System.out.printf("%s�� �Է��߽��ϴ�.\n", str);*/
		//����3] ����� ���ڿ� �Է��� �ȵǴ� ���׸� �ذ��Ͻÿ�
		
		/*System.out.print("���ڸ� �Է��ϼ���.\n>");
		int i = sc.nextInt();
		System.out.printf("%d��(��) �Է��߽��ϴ�.\n", i);
		
		System.out.print("���ڸ� �Է��ϼ���.\n>");
		int j = sc.nextInt();
		System.out.printf("%d��(��) �Է��߽��ϴ�.\n", j);
	
		System.out.print("���ڿ��� �Է��ϼ���.\n>");
		sc.nextLine();	// ���� �Է¹޴� ���� int���⿡ ���� ���� �ٲ��ֱ����� ���� string���� �����ش�
		String k = sc.nextLine();
		System.out.printf("%s�� �Է��߽��ϴ�.\n", k);*/
		
		System.out.print("���ڸ� �Է��ϼ���.\n");
		char c = sc.nextLine().charAt(0);
		System.out.println(c);
		
		/* ���ڿ� �Է��ؼ� ���ϴ� ��°���� ���� ����ϱ�
		System.out.print("���ڿ��� �Է��ϼ���.\n>");
		String str = sc.nextLine();
		
		System.out.print("���ڿ� �� ã���� ������ ��ȣ�� �Է��ϼ���.");
		int inVal = sc.nextInt();
		
		char inC = str.charAt(inVal);
		System.out.printf("%c�� %s�� %d��° �����Դϴ�.",inC, str, inVal);
		*/
	}

	
	
}
