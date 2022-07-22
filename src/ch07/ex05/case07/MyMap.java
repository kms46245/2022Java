package ch07.ex05.case07;

import java.util.HashMap;
import java.util.Map;

public class MyMap {
	public static void main(String[] args) {
		Map<Integer, User> map = new HashMap<>();
		
		// put의 1번째 파라미터 key 2번째 value
		map.put(1, new User("최한석"));
		map.put(2, new User("한아름"));
		map.put(3, new User("양승일"));
		System.out.println(map);
		
		User user = map.get(1);	// get을할땐 key값을 입력한다.
		System.out.println(user);
		System.out.println(map);
		
		user = map.remove(1);	// remove할때도 마찬가지다
		System.out.println(user);	// get으로 이미 받아서 user에는 값이 남아있다.
		System.out.println(map); // 대신 map에서는 사라졌다.
	}
}
