package sec02;

import java.util.Scanner;

public class 연산자2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("x의 초기값을 입력해주세요");
		int a = s.nextInt();

		System.out.println("y의 초기값을 입력해주세요");
		int b = s.nextInt();

		System.out.println("연산자 기호를 입력해주세요");
		String c = s.next();

		if (c.equals("+")) {
			a++;
			System.out.printf("a의값은%d입니다",a);
		} else {
			b--;
			System.out.printf("b의값은%d입니다",b);
		}

	}

}
// x 초기값 입력 
//y 초기값 입력