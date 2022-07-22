package ch04.home.ex05;

public class H02_369 {
	public static void main(String[] args) {
		int tens = 0;
		int ones = 0;
		
		for(int i = 1; i <= 99; i++) {
			tens = i / 10;
			ones = i % 10;
			
			System.out.print(" "+ i);
			if(tens % 3 == 0 && tens != 0) System.out.print("Â¦");
			if(ones % 3 == 0 && ones != 0) System.out.print("Â¦");
			
			if(i % 10 == 0) System.out.println("");
		}
	}
}

/*
 *°úÁ¦] 369°ÔÀÓÀ» ÇÏ¶ó
 *¼ýÀÚ´Â 1ÀÌ»ó 99ÀÌÇÏÀÌ´Ù
 *10´ÜÀ§ ÁÙ¹Ù²ÞÀ» ÇÑ´Ù. 
 *
 *1 2 3Â¦ 4 5 6Â¦ 7 8 9Â¦ 10
 *11 12 13Â¦ 14 15 16 Â¦ .....
 *91Â¦ 92Â¦ 93Â¦Â¦
 */

	
//ÀÌÁßfor¹®°ú ifÁ¶°Ç¹®À» ÀÌ¿ë
		/*
		 * int oneDigit = 0, tenDigit = 0; String oneClap = "", tenClap = "";
		 * 
		 * for(tenDigit = 0; tenDigit < 10; tenDigit++) { for(oneDigit = 0; oneDigit <
		 * 10; oneDigit++) {
		 * 
		 * if(oneDigit % 3 == 0 && oneDigit != 0) oneClap = "Â¦"; else oneClap = "";
		 * if(tenDigit % 3 == 0 && tenDigit != 0) tenClap = "Â¦"; else tenClap = "";
		 * 
		 * if(tenDigit == 0 && oneDigit == 0) // 0ÀÏ¶§ System.out.print(""); else
		 * if(tenDigit == 0 && oneDigit > 0) // ÇÑÀÚ¸´¼ö System.out.printf("%d%s ",
		 * oneDigit, oneClap); else System.out.printf("%d%d%s%s ",tenDigit, oneDigit,
		 * tenClap, oneClap); }
		 * System.out.println("\n-----------------------------------------------"); }
		 */