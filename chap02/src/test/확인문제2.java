package test;

import java.util.Scanner;

public class 확인문제2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("첫번째 수:");
		String n1 = s.next();
		System.out.println("두번째 수:");
		String n2 = s.next();

		int num1 = Integer.parseInt(n1);
		int num2 = Integer.parseInt(n2);
		if (num1 > num2) {
			int result2 = num1 - num2;
			System.out.println("뺄샘결과는:" + result2);
		} else {

			int result = num1 + num2;
			System.out.println("덧셈 결과:" + result);
		}

	}
}
// String 타입을 정수 int 타입으로 변환 할떄 Integer.parseInt(바꾸고자 하는 변수)를 입력한다.
// 두수를 입력 받는다
// 첫번쨰 수가 두번째 수보다 더 크면 뺄셈 실행 하고 두번째 수가 더 크면 덧셈 실행한다