package ch06.ex05.case01;

public class Shoes extends Product{
	private int price;			// member variable�� �θ��ڽİ��� �������
	
	public Shoes(int price) {
		super(price);
		this.price = price;		// �� Ŭ����Ÿ�Ժ��� price�� �ߺ��Ǿ VM�� ���迡 ���� product�� price�� �ҷ������� �����ȴ�.
								// ������ �� Ŭ����Ÿ���� price�� ���� �����Ѵ�.
	}
}
