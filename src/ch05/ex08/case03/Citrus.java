package ch05.ex08.case03;

public class Citrus {			// ���� - ������� -> ������ -> �Ϲݸ޼��� -> getter/setter
	private String name;
	
	public Citrus() {
		//this.Citrus("������"); // error - new ������ ������ ����
		//new Citrus("������");  // bug - ��ü ��ü�� 2���� ��������� ���ο� ������ ù��° ��ü�� null��
		this("������");		   // this()�� ���ؼ� �⺻�����ڿ��� �ٸ��������� ������ ����Ҽ� �ִ�.
	}

	public Citrus(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
