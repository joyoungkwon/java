package sec01;
import  java.util.*;
public class HashSetExample {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<String>();
		
		set.add("자바"); // x. add 식
		set.add("제이디비씨");
		set.add("서블릿");
		set.add("아이바티스");
		set.add("제이디비씨"); // ArrayList 는 같은 Object 가 중복 해서 저장되지만
		// HashSet은 중복 저장이안됌
		
		Iterator<String> iter = set.iterator(); // HashSat 고유 반복자.
		// 이용할떄 while 문 
		while(iter.hasNext()) { // while 안의 iter. hasNext()
			// hasNext() HashSet의 메소드.
			String str = iter.next();
			System.out.println(str);
		}
		System.out.println();
		
		
		iter = set.iterator();
		for(String str : set) {
			System.out.println(str);
		}
		System.out.println();
		
		set.clear(); // set 의 저장되어있는 모든 데이터를 삭제하는 메서드
		if(set.isEmpty()) { // isEmpty -컬렉션이 비어있는지 확인하는 메서드
			System.out.println("비어있음.");
		}
	}
}
