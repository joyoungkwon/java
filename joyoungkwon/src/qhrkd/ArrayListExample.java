package qhrkd;
import java.util.*;
public class ArrayListExample {

	public static void main(String[] args) {
		List <String>list = new ArrayList<>();
		//제네럴 <> 받을타입목적.
		//기본적으로 사용하는 배열은, 문자길이의 수가 한정되어있고 기본적으로 배열의 길이를
		//생성하고 추가하는 식이라 불편함이 있음.
		// 이러한 점을 보완하고자 List 인터페이스를 구현한 ArrayList 를 사용하는거
		//다른점은 추가할때마다 따로선언하지않아도 자동으로 길이값이 추가되거나 늘어남
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
		//List를 구현한 ArrayList에 추가 하는 메소드
		//add
		
		list.remove(1); //int타입 메소드 지우기
		list.remove("e"); // obj 오브젝트 객체비교해서 같은 obj삭제
		//list.clear - ArrayList 에 모든 데이터 삭제.
		
		
		for(int i = 0; i<list.size(); i++) { // 기본 타입의 배열과 다르게 leght말고
			// ArrayList의 배열은 size로 입력된 배열의 길이값을 리턴
			String str = list.get(i);
			
			//get으로불러옴 특정데이터 리턴
			System.out.println(str);
		}
		
		System.out.println();
		
		for(String str : list) { //향상된포문. 
			//만들고자하는객체 ,저장된 
			System.out.println(str);
		}
	}

}
