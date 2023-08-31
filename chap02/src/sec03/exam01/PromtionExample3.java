package sec03.exam01;

import java.util.Scanner;

public class PromtionExample3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("출신 학교를 입력하세요");
		String a = s.next();
		char b = a.charAt(2);
		System.out.println("현재 몇학년인가요?");
		int x = s.nextInt();

		if (b == '중') {
			System.out.println("당신은 중학교" + x + "학년입니다.");
		} else {
			System.out.println("당신은 고등학교" + x + "학년입니다.");
		}
	}

}
