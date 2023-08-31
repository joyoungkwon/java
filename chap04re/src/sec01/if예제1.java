package sec01;

import java.util.Scanner;

public class if예제1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("가수이름");
		String name = s.next();
		System.out.println("가수평점");
		int point = s.nextInt(); // 1점부터 10점만점
		// 평점이 8점 이상이면 "최상급"
		// 5점 이상이면 "중급"
		// 나머지 하급
		
		
		String grade; // if 문 안에서 변수를 선언하여 저장 시키면 마지막 출력을 못함
		// 밖에서 선언.
		if (point >= 8) {
			grade = "최상급";
		} else if (point >= 5) {
			grade = "중급";
		} else {
			grade = "하급";
		}
		
		System.out.println(name + "님의 등급은 " + grade + "입니다.");
	}

}
