package test;

import java.util.Scanner;

public class 확인문제2re {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("첫번째 수:");
		String n1 = s.next();
		System.out.println("두번째 수:");
		String n2 = s.next();

		if (n1.equals(n2)) {
			System.out.println("두수가 같아요");

		} else {
			System.out.println("두수가달라요");
		}
	}
}
//첫 번째 수와 두번째 수가 같으면 = 두수가 같아요
// 두번째 수와 두번째 수가 다르면 = 두수가 달라요
//if 문에서 숫자 비교 == 같다 a>b a가 b보다 클때
// 스트링 타입의 문자열 (변수)equals(변수) < 같다 if에서 else>