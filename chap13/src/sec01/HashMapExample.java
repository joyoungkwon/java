package sec01;
import  java.util.*;

public class HashMapExample {


	public static void main(String[] args) {
		// 맵 안에 제네릭 스트링 키 Integer key값
		// HasMap으로 구현한 map
		Map<String ,Integer> map = new HashMap<>();
		map.put("a", 75);
		map.put("b", 33); // 덮어쓰여짐
		map.put("c", 65);
		map.put("b", 85); // 동일(키값) 있을시 값을 덮어쓰기.
		
		System.out.println("총 갯수\t"+ map.size());
		System.out.println("b의점수는\n"+map.get("b"));
		//맨마지막으로 덮어 쓰기 한 b의 값으로 출력
		
		Set<String> keySet = map.keySet(); //맵의 저장되어있는 키값 모두 불러오기
		
		Iterator<String> keyiter = keySet.iterator(); // 
		// Iterator 반복자 <제네렉의 타입 (키값이 String)이라서 >
		while(keyiter.hasNext()) {
			String key  = keyiter.next();
			// 반복해서 키를 가져옴
			Integer value = map.get(key);
			//반복해서 키의 값의 값을 가져옴
			System.out.println(key + " "+ value);
		}
		System.out.println();
		
		map.remove("b"); // (남은키 a,c)
		System.out.println("총개수는:\n"+map.size());
		
		System.out.println();
		
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryiter = entrySet.iterator();
		while(entryiter.hasNext()) {
			Map.Entry<String, Integer> entry = entryiter.next();
			String key = entry.getKey();
			// 반복해서 키를 가져옴
			Integer value = entry.getValue();
			//반복해서 키의 값의 값을 가져옴
			System.out.println(key + " "+ value);
		
	}

}
}