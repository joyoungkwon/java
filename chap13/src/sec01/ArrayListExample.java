package sec01;

import java.util.*;

public class ArrayListExample {

	public static void main(String[] args) {
		List <String>list = new ArrayList<String>();
		
		list.add("Java");  // 0
		list.add("JDBC"); // 1
		list.add("Servlet/JSP"); // 2
		list.add(2,"Database"); //3
		list.add("iBATIS"); // 4
		// 2번쨰 방의 database을 추가하면 원래있던 Servlet 이밀려서 3번이됌
		// 바로 뒤로 밀리는게 특징.
		int size = list.size();
		System.out.println("ArrayList 에 list 의\n 저장되어있는\n 객체의 수는"+ size);
		
		String skill = list.get(2);
		System.out.println(skill);
		// list의 저장되어 있는 2번째 값을 skill의 저장후
		// 호출
		
		for(int i =0 ; i<list.size(); i++) {
			//다른거와 다르게 size.
			String str = list.get(i);
			// 	str에 list 를 객체받은 ArrayList 의 메소드 get으로 
			// i번째 배열에 저장된 값을 str의 저장함
			
			System.out.println(i+":"+str);
		}
		list.remove(2); // 2번째 방에 있던 database값을 삭제.
		list.remove(2); // 삭제되면 차례대로 뒤에있던 값이 앞으로 떙김
		list.remove("iBATIS"); // 내용 가지고도 삭제가능.
		// obj 타입 끼리 비교후 일치하는 문자열이나 obj삭제
		
//		System.out.println(list.get(2));
//		// 삭제되서 iBatis출력.
	}

}
