package ch05.ex01.case03;

public class Main {
	public static void main(String[] args) {
		User user1 = new User();
		User user2 = new User();
		
		/*
		user1.name = "최한석";	//method를 사용하지않으면 하나하나씩 넣는다.
		user1.age = 12;
		
		user2.name = "한아름";
		user2.age = 22;
		*/
		
		User user = new User();
		user.setName("최한석");
		user.setAge(12);
				
		System.out.printf("%s의 나이는 %d입니다.\n", user.getName(),user.getAge());
		
		user.setName("한아름");
		user.setAge(22);		//같은 user로 값을 자유자재로 변경가능
		//user.name = "양승일";	// private으로 변수를 임의적으로 불러오기 불가능하게한다
		
		System.out.printf("%s의 나이는 %d입니다.\n", user.getName(),user.getAge());
		//System.out.printf("%s의 나이는 %d입니다.\n", user.name,user.age);
				
	}
}
