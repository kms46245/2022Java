package ch03.home.ex06;

import java.util.Scanner;

public class ID {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
			
	Scanner sc = new Scanner(System.in);
	// charAt�� �̿��� �������� �� int�� ��ȯ
	
	/*
	 * String idNum = ""; char genderNum = 0; int iGenderNum = 0;
	 * 
	 * System.out.println("�ֹε�Ϲ�ȣ�� �Է��ϼ���.");
	 * idNum = sc.nextLine();
	 *  genderNum =  idNum.charAt(7);
	 *  iGenderNum = (int)genderNum;
	 * 
	 * System.out.printf("�Է��Ͻ� �ֹε�Ϲ�ȣ : %s\n",idNum.substring(0,14));
	 * 
	 * if(genderNum % 2 == 0) System.out.println("�����Դϴ�."); else
	 * System.out.println("�����Դϴ�.");
	 */
	
	
	// codePointAt�� �̿��� �����ڵ尪����
	String idNum = "";
	int genderNum = 0;
		
	System.out.println("�ֹε�Ϲ�ȣ�� �Է��ϼ���.");
	idNum = sc.nextLine(); 
	genderNum = idNum.codePointAt(7);
	//System.out.printf("�Է��Ͻ� �ֹε�Ϲ�ȣ : %s\n",idNum.substring(0,14));
	 
	if(genderNum % 2 == 0)
		System.out.println("�����Դϴ�.");		
	else
		System.out.println("�����Դϴ�.");
	}
}

/*
�ֹε�Ϲ�ȣ�� �Է��Ѵ�.
���ฦ �Ǵ��ؼ� ����Ѵ�.
---
�ֹε�Ϲ�ȣ : 201214-1234567
�����Դϴ�.


*/