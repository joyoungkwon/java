package sec01;

import java.util.Scanner;

public class StringCharAtExample2 {

	public static void main(String[] args) {
		// 2명의 이름과 처리코드를 입력 받으세요 // 이름
		// 예> 홍길동 c88 장동건 b70
		// 맨앞 문자는 등급 나머지 2글자는 점수입니다.
		// 등급은 a~d 등급 까지 존재하고
		// A등급은 점수에 20% 가산 , b등급은 점수에 10% 가산
		// c등급은 점수에 5 % 가산
		// 최종점수가 90이면 최우수 80 이면 우수
		// 나머지 일반
		// 최종 출력 홍길동님은 최우수 등급입니다.

		// 연산식. a 일때는 20% b 일때는 점수 10%
		// c는 5%
		// score *0.2 + score 20
		// score *0.1 + score 10

		String[] names = new String[2];
		int[] scores = new int[2];
		char code = 0;

		for (int i = 0; i <= names.length; i++) {

			Scanner s = new Scanner(System.in);
			System.out.println("이름 과 코드를 입력하세요. ");
			names[i] = s.next();

			String a = names[i].substring(4);
			int score = Integer.parseInt(a);

			code = names[i].charAt(3);
		}

		for (int i = 1; i <= names.length; i++) {

			switch (code) {
			case 'A':
				scores[i] *= 1.2;
				break;
			case 'B':
				scores[i] *= 1.1;
				break;
			case 'C':
				scores[i] *= 1.05;
				break;
			}
			names[i] = names[scores[i]];
		}

		for (int i = 0; i <= names.length; i++) {

			if (scores[i] > 90) {
				System.out.println(names[i] + "님의 등급은 최우수입니다.");
			} else if (scores[i] > 80) {
				System.out.println(names[i] + "님의우수입니다.");
			} else {
				System.out.println(names[i] + " 일반입니다.");
			}
		}
	}

}
