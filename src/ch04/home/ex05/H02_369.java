package ch04.home.ex05;

public class H02_369 {
	public static void main(String[] args) {
		int tens = 0;
		int ones = 0;
		
		for(int i = 1; i <= 99; i++) {
			tens = i / 10;
			ones = i % 10;
			
			System.out.print(" "+ i);
			if(tens % 3 == 0 && tens != 0) System.out.print("¦");
			if(ones % 3 == 0 && ones != 0) System.out.print("¦");
			
			if(i % 10 == 0) System.out.println("");
		}
	}
}

/*
 *����] 369������ �϶�
 *���ڴ� 1�̻� 99�����̴�
 *10���� �ٹٲ��� �Ѵ�. 
 *
 *1 2 3¦ 4 5 6¦ 7 8 9¦ 10
 *11 12 13¦ 14 15 16 ¦ .....
 *91¦ 92¦ 93¦¦
 */

	
//����for���� if���ǹ��� �̿�
		/*
		 * int oneDigit = 0, tenDigit = 0; String oneClap = "", tenClap = "";
		 * 
		 * for(tenDigit = 0; tenDigit < 10; tenDigit++) { for(oneDigit = 0; oneDigit <
		 * 10; oneDigit++) {
		 * 
		 * if(oneDigit % 3 == 0 && oneDigit != 0) oneClap = "¦"; else oneClap = "";
		 * if(tenDigit % 3 == 0 && tenDigit != 0) tenClap = "¦"; else tenClap = "";
		 * 
		 * if(tenDigit == 0 && oneDigit == 0) // 0�϶� System.out.print(""); else
		 * if(tenDigit == 0 && oneDigit > 0) // ���ڸ��� System.out.printf("%d%s ",
		 * oneDigit, oneClap); else System.out.printf("%d%d%s%s ",tenDigit, oneDigit,
		 * tenClap, oneClap); }
		 * System.out.println("\n-----------------------------------------------"); }
		 */