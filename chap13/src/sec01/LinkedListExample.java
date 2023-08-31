package sec01;

import java.util.ArrayList;
import java.util.*;

public class LinkedListExample {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new LinkedList<String>();
		
		
		long startTime; //초기시간
		long endTime; // 마무리시간.
		
		startTime = System.nanoTime(); // 스타트 시간을 나노 시간으로 변경
		for(int i =0; i<10000; i++) { // 10000번 돌아가는 시간.
			list1.add(0,String.valueOf(i));// list 에 만번 방만들기.
		}
		endTime = System.nanoTime(); // end 타임 끝나는 시간.
		System.out.println("걸린시간"+(endTime-startTime)+"ns");
		//end 타입에서 start타임 을 빼면 뺀시간 값

	}

}
