package sec01;

import java.util.HashMap;
import java.util.*;

public class HashMapEx {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>(); // 해쉬맵 객체 생성.
		Scanner s = new Scanner(System.in);
		boolean start = true;

		while (start) {

			for (int i = 0; i < 3; i++) {
				System.out.println("나라입력");
				map.put(s.next(), s.nextInt());
			}
			System.out.println("찾고자 하는 나라검색");
			String country = s.next();
			if (country.equals("그만")) {
				System.out.println("종료");
				start = false;
			}

			if (map.containsKey(country)) {
				System.out.println("해당나라 인구수는" + map.get(country));
			} else {
				System.out.println("나라없음");
			}

		}

	}

}
