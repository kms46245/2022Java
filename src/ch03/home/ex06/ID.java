package ch03.home.ex06;

import java.util.Scanner;

public class ID {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
			
	Scanner sc = new Scanner(System.in);
	// charAt을 이용한 문자추출 및 int형 변환
	
	/*
	 * String idNum = ""; char genderNum = 0; int iGenderNum = 0;
	 * 
	 * System.out.println("주민등록번호를 입력하세요.");
	 * idNum = sc.nextLine();
	 *  genderNum =  idNum.charAt(7);
	 *  iGenderNum = (int)genderNum;
	 * 
	 * System.out.printf("입력하신 주민등록번호 : %s\n",idNum.substring(0,14));
	 * 
	 * if(genderNum % 2 == 0) System.out.println("여자입니다."); else
	 * System.out.println("남자입니다.");
	 */
	
	
	// codePointAt을 이용한 유니코드값추출
	String idNum = "";
	int genderNum = 0;
		
	System.out.println("주민등록번호를 입력하세요.");
	idNum = sc.nextLine(); 
	genderNum = idNum.codePointAt(7);
	//System.out.printf("입력하신 주민등록번호 : %s\n",idNum.substring(0,14));
	 
	if(genderNum % 2 == 0)
		System.out.println("여자입니다.");		
	else
		System.out.println("남자입니다.");
	}
}

/*
주민등록번호를 입력한다.
남녀를 판단해서 출력한다.
---
주민등록번호 : 201214-1234567
남자입니다.


*/