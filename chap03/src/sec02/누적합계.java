package sec02;

import java.util.Scanner;

public class 누적합계 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("첫번째 수를 입력하세요(1~20사이)");
		int a = s.nextInt();
		System.out.println("두번째 수를 입력하세요(1~20사이)");
		int b = s.nextInt();
		int result = 0;

//		while (true) {
//			if (a <= b) {
//				result += a;// a5 면 //a 6 result 는 a를 담는다 (반복해서)
//				++a; // 1씩 증가 시킨다.
//			} else {
//				break;
//			}
//		}
		for (int i = a; i <= b; i++) {
			result += i;
		}

		System.out.println("두 수의 누적 합계는:" + result);

		// 첫번째 숫자가 5, 두번째가 8
		// 5+6+7+8 결과를 출력 a= 4

	}

}
