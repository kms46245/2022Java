package ch02.ex01;

public class C05Scope {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int i = 0;
		
		//int i = 0;      // -> ���� �Լ� ������ ���� �̸��� ������ �����Ҽ� X
		int j = 0;
		{
			int x = 0;
			int y = 0;
		}
		int x = 0;			// -> �Լ��� ������ �ش� ������ �޸𸮴� ���ŵǾ��⿡ �ٽ� ����
	}
}
