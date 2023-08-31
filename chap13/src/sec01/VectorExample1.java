package sec01;

import java.util.*;

public class VectorExample1 {

	public static void main(String[] args) {

		List<Integer> list = new Vector<>();
		Scanner s = new Scanner(System.in);
		boolean start = true;
		

		System.out.println("양의 점수를 입력하세요 -1 이 나오면 멈춥니다.");
		while (start) {
			int key = s.nextInt();
			if (key == -1) {
				System.out.println("종료합니다.");
				start = false;
			} else {
				list.add(key); // 나올때까지반복
			}
			
			int max = list.get(0);
			for (int i = 1; i < list.size(); i++) {

				// 입력된 제일큰수 출력하기.
				if (max<list.get(i)) {
					max = list.get(i);
				}
				
			}
			System.out.println("가장큰수"+ max);
		}
	}

}
