package ch04.home.ex03;

import java.util.Scanner;

public class Money {
	public static void main(String[] args) {
		/*
		 * int random = 0; int money = 0; int sum = 0;
		 * 
		 * do { money = (int)(Math.random() * 29 + 1) * 1000;
		 * 
		 * System.out.printf("%d��\n", money);
		 * 
		 * sum += money;
		 * 
		 * }while(sum < 30000);
		 * 
		 * System.out.printf("%d���� ���½��ϴ�.", sum);
		 */
		
		int price = 30_000;
		int tot = 0; // �տ� �� ��
		int tmp = 0; // ���� ��
		
		while(tot < price) {
			tmp = ((int)(Math.random() * 30) + 1) * 1000;
			System.out.println(tmp);
			
			tot += tmp;
		}
		System.out.printf("\n%d���� ���½��ϴ�.", tot);
		
	}
}
/*
 ����] 3����¥�� ���ǰ��� ġ���
 
 �������� ���� ������ ������.
 ������ 5�������� ����.
 ���� ���� ��(����)�� �������� �ʴ´�.(�ݾ׸� ������)
 �ѹ� ���� ���� �հ�� 3���� �����̴�.
 ����������, ���� �ݾ��� ����Ѵ�.
  
 12000
 2000
 6000
 10000
 
 */
 