package ch05.ex08.case01;

public class Baby {
	private String name;

	public Baby() { }			// ������ - �Է������������ �� ���¸� �����Ϸ��� �ڵ����� �Է��Ѵ�.
	public Baby(String name) {  // �Ķ���Ͱ� �ִ� ������ - �ʿ��� �Ķ���Ͱ��� �����鼭 ������ �� �ִ�.
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
