package ch07.ex05.case07;

import java.util.HashMap;
import java.util.Map;

public class MyMap {
	public static void main(String[] args) {
		Map<Integer, User> map = new HashMap<>();
		
		// put�� 1��° �Ķ���� key 2��° value
		map.put(1, new User("���Ѽ�"));
		map.put(2, new User("�ѾƸ�"));
		map.put(3, new User("�����"));
		System.out.println(map);
		
		User user = map.get(1);	// get���Ҷ� key���� �Է��Ѵ�.
		System.out.println(user);
		System.out.println(map);
		
		user = map.remove(1);	// remove�Ҷ��� ����������
		System.out.println(user);	// get���� �̹� �޾Ƽ� user���� ���� �����ִ�.
		System.out.println(map); // ��� map������ �������.
	}
}
