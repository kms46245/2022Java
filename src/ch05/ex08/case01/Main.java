package ch05.ex08.case01;

public class Main {
	public static void main(String[] args) {
		Baby baby = new Baby();
		// ��ü�� ���鶧(new) �ҷ����� ���� �ٷ� �����ڴ�.
		// method call - 1. class.method - static
		//               2. ��ü.method - instance
		//               3. new.������ - ������
		baby.setName("�ʷ���");
		
		Baby baby2 = new Baby("ưư��");
	}
}
