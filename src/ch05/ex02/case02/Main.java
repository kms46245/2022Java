package ch05.ex02.case02;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		Board board = new Board();
		
		board.setMsg("�ູ�� �Ϸ縦 �����սô�.");
		board.setWrittenDate(LocalDate.now());
		
		board.setMsg("��մ� ��⸦ ���� ����");
		
		
		System.out.printf("%s, %s",board.getMsg(),board.getWrittenDate());
	}
}
