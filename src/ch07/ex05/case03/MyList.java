package ch07.ex05.case03;

import java.util.ArrayList;

public class MyList {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(1);	// ù��° value�� �׹�° value�� ������ ������ key�� �ٸ��⿡ �ٸ������̴�
		
		System.out.println(list);
		//����Ʈ ��ü�� Integer Ÿ�������� value�� int���� �ڵ����� �ٲ� - AutoBoxing
		
		for(int i: list) System.out.print(i + " ");
		System.out.println();
		
		System.out.println(list.get(0));	// key���� �̿��� �ҷ��´�
		
		for(int i = 0; i < list.size(); i++) 
			System.out.print(list.get(i) + " ");
		
		System.out.println();
		
		
		for(int i = 0; i < list.size(); i++)
			 System.out.print(list.remove(i) + " ");
		//remove�� algorithm�� �ش� �迭�� value�� ����� value�� ĭ�� ��ĭ�� ����
		 
		
		// ����] remove�� �̿��Ͽ� list�� ��� ���Ҹ� �����϶�.
		for(int i = list.size()-1; i >= 0; i--)
			System.out.println(list.remove(i) + " ");
		
		System.out.println(list);
	}
}
