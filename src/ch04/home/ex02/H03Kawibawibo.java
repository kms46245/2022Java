package ch04.home.ex02;

import java.util.Scanner;

public class H03Kawibawibo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int playerChoice = 0;
		int appChoice = 0;
		String result = "";
		String choice = "";
		
		System.out.println("1.���� 2.���� 3.��\n>");
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
			case 1: choice = "����"; break;
			case 2: choice = "����"; break;
			case 3: choice = "��";
			}
			System.out.println("You: " + choice);
			
			switch(appChoice) {
			case 1: choice = "����"; break;
			case 2: choice = "����"; break;
			case 3: choice = "��";
			}
			System.out.println("Me: " + choice);
			
		} else {
			result = "ERROR] 1, 2, 3 �߿� �ϳ��� �Է��ϼ���.";
		}
				
		System.out.println(result);
	}
}
/*
// switch�� �̿��� ���������� �˰��� (1�ܰ�)
switch(pChoice) {
case 1: if(cChoice == 2) winStatus = 2; // ��
		  else if(cChoice == 3) winStatus = 1; //��
		  break;
case 2: if(cChoice == 1) winStatus = 1; // ��
        else if(cChoice == 3) winStatus = 2; //��
        break;
case 3: if(cChoice == 1) winStatus = 2; //��
        else if(cChoice == 2) winStatus = 1; // ��
}*/

/*//������������ ������ �̿��� if��(2�ܰ�)
Scanner sc = new Scanner(System.in);
int pChoice = 0;
int cChoice = 0;

String pStatus = "";
String cStatus = "";
String Message = "";

int winStatus = 0;
// 0 = draw / 1 = win / 2 = lose / 3 = error

cChoice = (int)(Math.random() * 10 / 3.3) + 1; // 1~3���� ����

System.out.print("1.���� 2.���� 3.��\n>");
pChoice = sc.nextInt();
		
if(pChoice == cChoice) 				  winStatus = 0;	// draw
else if((pChoice == 1 && cChoice == 3) ||
		(pChoice > cChoice))		  winStatus = 1;    // win
else if((pChoice == 3 && cChoice == 1) ||
		(pChoice < cChoice))          winStatus = 2;    // lose
else if(pChoice <= 0 || pChoice >= 4) winStatus = 3;	// error
		

switch(pChoice) {
case 1: pStatus = "����"; break;
case 2: pStatus = "����"; break;
case 3: pStatus = "��";
}		
switch(cChoice) {
case 1: cStatus = "����"; break;
case 2: cStatus = "����"; break;
case 3: cStatus = "��";
}		
System.out.printf("You = %s\nMe = %s\n",pStatus,cStatus);

switch(winStatus){
	case 0: Message = "Fair"; break;
	case 1: Message = "You Win"; break;
	case 2: Message = "You Lose"; break;
	case 3: Message = "�߸� �Է� �ϼ̽��ϴ�.";
}		
System.out.print(Message);
*/



/*
 * ����] �۰� ������������ �϶�.
 * ���� ����� �˷��ش�.
 * ����� 
 * You Win.
 * You Lose.
 * Fair.
 * �߿� �ϳ� �̴�.
 * ex)1.����, 2.����, 3.��
 * > 1
 * You : ����
 * Me : ��
 * You Win.
 */
