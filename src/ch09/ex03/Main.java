package ch09.ex03;

public class Main {
	public static void main(String[] args) {
		Counter counter = new Counter();
		new Player(counter).start();	// ���� ������ ���·� ���� �����尡 �װ��� �������⶧����
		new Player(counter).start();	// �ᱹ �ش簪�� �����ǰ���.
		new Player(counter).start();
		new Player(counter).start();
		new Player(counter).start();
		// synchronized�� ����� ���Ŀ� ���� ���������ʾҴ�(���������)
	}
}
