package ch04.ex02;

public class C02Switch {
	public static void main(String[] args) {
		String grade = "gold";
		String coupon = "";
		
		switch(grade) {
		case "gold": coupon += "10,000¿ø ";
		case "silver": coupon += "5,000¿ø ";
		case "copper": coupon += "1,000¿ø ";
		}

		System.out.println(coupon);
	}
}
