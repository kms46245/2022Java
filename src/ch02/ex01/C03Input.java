package ch02.ex01;

import java.util.Scanner;		// 기본 패키지에 보관된 기능이 아니므로 추가 (ctrl + shift + o)

public class C03Input {
	public static void main(String[] args)	{
		Scanner sc = new Scanner(System.in);
		/*System.out.print("문자열을 입력하세요.\n>");
		//과제2] <입력데이터>를 입력했습니다. 는 확인 메세지를 출력한다.
		String str = sc.nextLine();
		System.out.printf("%s를 입력했습니다.\n", str);
		*/
		
		/*System.out.print("숫자를 입력하세요.\n>");
		int i = sc.nextInt();
		System.out.printf("%d을(를) 입력했습니다.\n", i);
		
		System.out.print("숫자를 입력하세요.\n>");
		int j = sc.nextInt();
		System.out.printf("%d을(를) 입력했습니다.\n", j);
	
		System.out.print("문자열을 입력하세요.\n>");
		String str = sc.nextLine();
		System.out.printf("%s를 입력했습니다.\n", str);*/
		//과제3] 실행시 문자열 입력이 안되는 버그를 해결하시오
		
		/*System.out.print("숫자를 입력하세요.\n>");
		int i = sc.nextInt();
		System.out.printf("%d을(를) 입력했습니다.\n", i);
		
		System.out.print("숫자를 입력하세요.\n>");
		int j = sc.nextInt();
		System.out.printf("%d을(를) 입력했습니다.\n", j);
	
		System.out.print("문자열을 입력하세요.\n>");
		sc.nextLine();	// 이전 입력받는 형이 int였기에 받은 형을 바꿔주기위해 값을 string으로 돌려준다
		String k = sc.nextLine();
		System.out.printf("%s를 입력했습니다.\n", k);*/
		
		System.out.print("문자를 입력하세요.\n");
		char c = sc.nextLine().charAt(0);
		System.out.println(c);
		
		/* 문자열 입력해서 원하는 번째수의 문자 출력하기
		System.out.print("문자열을 입력하세요.\n>");
		String str = sc.nextLine();
		
		System.out.print("문자열 중 찾으실 문자의 번호를 입력하세요.");
		int inVal = sc.nextInt();
		
		char inC = str.charAt(inVal);
		System.out.printf("%c는 %s의 %d번째 문자입니다.",inC, str, inVal);
		*/
	}

	
	
}
