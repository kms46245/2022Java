package ch04.ex01;

public class C03If {
	public static void main(String[] args) {
		/*int hour = 23;		
		 * if(hour < 12){ System.out.println("Good Morning"); } else if(hour < 18) {
		 * System.out.println("Good Afternoon"); } else if(hour < 21) {
		 * System.out.println("Good Evening"); } else{ System.out.println("Good Night");
		 * }
		 */
		
		int hour = 19;
		
		String bow = "";
		if(hour < 12) bow = "Good Monring";
		else if (hour < 18) bow = "Good Afternoon";
		else if (hour < 21) bow = "Good Evening";
		else bow = "Good Night";
		System.out.println(bow);
	}

}
