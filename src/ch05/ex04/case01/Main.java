package ch05.ex04.case01;

public class Main {
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		System.out.printf("%d, %d", Card.width,Card.height);
		//��ü�� �������� �ʴ��� call�� �ȴ�.
		
		Card.width = 10;
		Card.height = 20;	// �����Ǵ� �������� ������ �ȴ�.
		
		//Card.kind; - instance ������ ���������ʾ����Ƿ� �ҷ������ʴ´�.
		//Card.number;
		
		Card card1 = new Card();
		Card card2 = new Card();
		
		card1.kind = "heart";
		card1.number = 7;
		
		card2.kind = "spade";
		card2.number = 4;
		
		System.out.printf("\n%s, %s\n" ,card1.kind,card2.kind);
		System.out.printf("\n%d, %d", Card.width, Card.height);	
		System.out.printf("\n%d, %d", card1.width, card1.height);
		
		card1.width = 100;	// ������ ��ü�� ���� ����
		System.out.printf("\n%d, %d", card2.width, card2.height); // �ٸ� ��ü���� ������ �޴´�.
		
	}
}
