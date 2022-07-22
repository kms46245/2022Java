package ch04.home.ex02;

import java.util.Scanner;

public class H03Kawibawibo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int playerChoice = 0;
		int appChoice = 0;
		String result = "";
		String choice = "";
		
		System.out.println("1.가위 2.바위 3.보\n>");
		playerChoice = sc.nextInt();
		appChoice = (int)(Math.random() * 3) + 1;
		
		if(1 <= playerChoice && playerChoice <= 3) {
			switch(playerChoice - appChoice) {
			case -2: case 1:
				result = "You win."; break;
			case -1: case 2:
				result = "You lose."; break;
			case 0:
				result = "Fair."; 			
			}
						
			switch(playerChoice) {
			case 1: choice = "가위"; break;
			case 2: choice = "바위"; break;
			case 3: choice = "보";
			}
			System.out.println("You: " + choice);
			
			switch(appChoice) {
			case 1: choice = "가위"; break;
			case 2: choice = "바위"; break;
			case 3: choice = "보";
			}
			System.out.println("Me: " + choice);
			
		} else {
			result = "ERROR] 1, 2, 3 중에 하나를 입력하세요.";
		}
				
		System.out.println(result);
	}
}
/*
// switch를 이용한 가위바위보 알고리즘 (1단계)
switch(pChoice) {
case 1: if(cChoice == 2) winStatus = 2; // 패
		  else if(cChoice == 3) winStatus = 1; //승
		  break;
case 2: if(cChoice == 1) winStatus = 1; // 승
        else if(cChoice == 3) winStatus = 2; //패
        break;
case 3: if(cChoice == 1) winStatus = 2; //패
        else if(cChoice == 2) winStatus = 1; // 승
}*/

/*//가위바위보의 패턴을 이용한 if문(2단계)
Scanner sc = new Scanner(System.in);
int pChoice = 0;
int cChoice = 0;

String pStatus = "";
String cStatus = "";
String Message = "";

int winStatus = 0;
// 0 = draw / 1 = win / 2 = lose / 3 = error

cChoice = (int)(Math.random() * 10 / 3.3) + 1; // 1~3까지 랜덤

System.out.print("1.가위 2.바위 3.보\n>");
pChoice = sc.nextInt();
		
if(pChoice == cChoice) 				  winStatus = 0;	// draw
else if((pChoice == 1 && cChoice == 3) ||
		(pChoice > cChoice))		  winStatus = 1;    // win
else if((pChoice == 3 && cChoice == 1) ||
		(pChoice < cChoice))          winStatus = 2;    // lose
else if(pChoice <= 0 || pChoice >= 4) winStatus = 3;	// error
		

switch(pChoice) {
case 1: pStatus = "가위"; break;
case 2: pStatus = "바위"; break;
case 3: pStatus = "보";
}		
switch(cChoice) {
case 1: cStatus = "가위"; break;
case 2: cStatus = "바위"; break;
case 3: cStatus = "보";
}		
System.out.printf("You = %s\nMe = %s\n",pStatus,cStatus);

switch(winStatus){
	case 0: Message = "Fair"; break;
	case 1: Message = "You Win"; break;
	case 2: Message = "You Lose"; break;
	case 3: Message = "잘못 입력 하셨습니다.";
}		
System.out.print(Message);
*/



/*
 * 과제] 앱과 가위바위보를 하라.
 * 게임 결과를 알려준다.
 * 결과는 
 * You Win.
 * You Lose.
 * Fair.
 * 중에 하나 이다.
 * ex)1.가위, 2.바위, 3.보
 * > 1
 * You : 가위
 * Me : 보
 * You Win.
 */
