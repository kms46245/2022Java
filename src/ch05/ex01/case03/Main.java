package ch05.ex01.case03;

public class Main {
	public static void main(String[] args) {
		User user1 = new User();
		User user2 = new User();
		
		/*
		user1.name = "���Ѽ�";	//method�� ������������� �ϳ��ϳ��� �ִ´�.
		user1.age = 12;
		
		user2.name = "�ѾƸ�";
		user2.age = 22;
		*/
		
		User user = new User();
		user.setName("���Ѽ�");
		user.setAge(12);
				
		System.out.printf("%s�� ���̴� %d�Դϴ�.\n", user.getName(),user.getAge());
		
		user.setName("�ѾƸ�");
		user.setAge(22);		//���� user�� ���� ��������� ���氡��
		//user.name = "�����";	// private���� ������ ���������� �ҷ����� �Ұ����ϰ��Ѵ�
		
		System.out.printf("%s�� ���̴� %d�Դϴ�.\n", user.getName(),user.getAge());
		//System.out.printf("%s�� ���̴� %d�Դϴ�.\n", user.name,user.age);
				
	}
}
