package ch05.home.ex01.case04;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = "";
		int age = 0;
		LocalDate regDate = null;
				
		System.out.print("�̸� : ");
		name = sc.nextLine();		
		System.out.print("���� : ");
		age = sc.nextInt();
		regDate = LocalDate.now();
		
		User user = new User();
		user.setName(name);
		user.setAge(age);
		user.setRegistDay(regDate);
		
		System.out.print("\n�̸� : " + user.getName() + "\n���� : " + user.getAge() +
				"\n������ : " + user.getRegistDay());
	}
}

/*
 ����] ����ڸ� �����϶�.
  ������� �̸�, ���̸� ���� �Է¹޴´�.
  �������� ���� ��¥�� �ڵ� �Է¹޴´�.
  ---------------
  �̸�: gambit
  ����: 25
  
  �̸� : gambit
  ���� : 25
  ������ : 2022-06-21
 */