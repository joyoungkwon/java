package sec01;

import java.util.*;

public class ArrayListExmaple1 {

	public static void main(String[] args) {
		List<Character> list = new ArrayList<>();
		Scanner s = new Scanner(System.in);

		boolean code = true;

		for (int i = 0; i < 6; i++) {
			System.out.println("학점입력");
			char grade = s.next().charAt(0);
			// next String 받는 문자열 체인식으로 charAt 으로 뽑아오기
			list.add(grade);
			// ArrayList에 add메소드로 추가하기
		}
		double sum = 0.0; // 값 세팅초기화
		double average = 0.0; // 실수 값으로 초기화

		for (int i = 0; i < list.size(); i++) {
			switch (list.get(i)) {
			// list의 i번째 방이랑 비교
			case 'A':
				sum += 4.0;
				break;
			case 'B':
				sum += 3.0;
				break;
			case 'C':
				sum += 2.0;
				break;
			case 'D':
				sum += 1.0;
				break;
			case 'E':
				sum += 1.0;
				break;
			case 'F':
				break;
			}
		}
		average = sum / 6;
		System.out.println("평균점수"+average);

	}

}
