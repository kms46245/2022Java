package ch03.ex04;

public class C01Artih {
	public static void main(String[] args) {
		byte a = 3;
		byte b = 2;
		//byte c = a + b;		// a + b�� ���� 5�� ���� int�� �б⿡ type mismatch
		byte c = (byte)(a + b);
		System.out.println(c);
		
		//c = c + 1; // ������ �տ����� �ϸ� int type���� �ٲ�⶧���� mismatch
		c++;		 //	���׿����ڴ� type�� �ٲ����ʴ´�.	
		System.out.println(c);
		
		double d = a / b;	// a / b�� ����ϴ� �������� overflow�� ��ä int���� �Ǿ� bug�߻�
		System.out.println(d);
		
		//d = ((double)a / (double)b);	// ����ϴ� �������� int���� �����ʰ� double�� �� ����
		d = (double)a / b;				// a�� double������ ���Ա⶧���� b�� �ڵ������� �������� double�� ������
		System.out.println(d);
		
		d = 1.0* a / b; //�����ھ��̵� ����� ����� ���� ���� �����ϴ�.
		System.out.println(d);
		
		d = (double)(a / b);			// ���ۿ�) ������ ��ġ�鼭 ������ ��������ϸ� int������ ��ȯ�Ǿ� overflow 
		System.out.println(d);
			
		d = a / b * 1.0;				// ���ۿ�2) ������ ���� ���Ǿ int������ ��ȯ�Ǿ� overflow
		System.out.println(d);
		
	}
}

/* ����)
byte c = a + b;�� ������ ������ �ذ��϶�
*/