package ch07.ex05.case02;

public class AutoBoxing {
	public static void main(String[] args) {
		int a1 = 1;
		Integer a2 = new Integer(1);
		int a3 = new Integer(1);	// �θ��ڽİ��� ���θ���� �ƴ� ���ڴٸ���ü�� ��ȯ�̴�
		Integer a4 = 1;		// AutoBoxing - �ڿ������� ���ͷ����� �ش� Ÿ������ boxing
							// �ڵ����� 7��°���� AutoUnboxing���� �����ִ�.
		
		boolean b1 = true;
		Boolean b2 = new Boolean(true);
		boolean b3 = new Boolean(true);
		Boolean b4 = true;
	}
}
