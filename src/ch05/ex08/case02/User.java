package ch05.ex08.case02;

import java.time.LocalDate;

public class User {
	private String name;
	private int age;
	private LocalDate regDate;
				//���ݵ��� ����� this�� �����Ϸ��� ����� �̷������� transparent ���־���. ������ �ۼ��ϸ� �۵�X
	public User(/*User this,*/String name, int age, LocalDate regDate) {
		this.name = name;			// this - ������Ÿ���� Ŭ������Ÿ���� �״�� ���󰣴�
		this.age = age;				// �ش� Ŭ���� ������Ÿ���� ��ü�� ����ִ�. �� �۾��� VM�� �ڵ����� ����
		this.regDate = regDate;
	}
	
	public User() {}				// �⺻�����ڴ� �ڵ����� ��������������� �ϳ����������̹Ƿ� �ϳ��������� ���� ���������Ѵ�.
	
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public LocalDate getRegDate() {
		return regDate;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setRegDate(LocalDate regDate) {
		this.regDate = regDate;
	}	
}
