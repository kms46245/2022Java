package ch02.ex02;

public class C03Str {
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		int c = 3;
		int sum = a + b + c;
		
		System.out.printf("sum: %d\n", sum);
		
		String sumStr = "" + sum;	// ������ ������ ���ڿ��� ��ȯ
		System.out.printf("sum: %s\n", sumStr);
		
		String S = "" + (a + b); // ������ �ƴϴ��� ��ȯ ����
		//String S = "" + a + b; // ����) ���� ������ �°� ��ġ�� �����ϰų� �Ұ�ȣ�� �̿��ؼ� �켱��������
		System.out.printf("sum: %s\n", S);
		
		String dialog = "John said, \"hello\"";
		System.out.printf("%s\n", dialog);
		
	}
	
}
