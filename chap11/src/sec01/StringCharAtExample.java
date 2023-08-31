package sec01;

import java.util.Scanner;

public class StringCharAtExample {

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
		Scanner s = new Scanner(System.in);
		System.out.println("첫번째이름 과 코드를 입력하세요. ");
		String name = s.next();
		System.out.println("두번째이름 과 코드를 입력하세요. ");
		String name2 = s.next();

		// 연산식. a 일때는 20% b 일때는 점수 10%
		// c는 5%
		// score *0.2 + score 20
		// score *0.1 + score 10

		String a = name.substring(4);
		int score = Integer.parseInt(a);

		a = name.substring(4);
		int score1 = Integer.parseInt(a);

		char code = name.charAt(3);
		char code2 = name.charAt(3);

		switch (code) {
		case 'A':
			score *= 1.2;
			break;
		case 'B':
			score *= 1.1;
			break;
		case 'C':
			score *= 1.05;
			break;
		}
		switch (code2) {
		case 'A':
			score *= 1.2;
			break;
		case 'B':
			score *= 1.1;
			break;
		case 'C':
			score *= 1.05;
			break;
		}

		if (score > 90) {
			System.out.println("홍길동님의 등급은 최우수입니다.");
		} else if (score > 80) {
			System.out.println("홍길동님의 우수입니다.");
		} else {
			System.out.println("홍길동님의 일반입니다.");
		}
		if (score1 > 90) {
			System.out.println("장동건님의 등급은 최우수입니다.");
		} else if (score1 > 80) {
			System.out.println("장동건님의우수입니다.");
		} else {
			System.out.println("장동건 일반입니다.");
		}
	}

}
