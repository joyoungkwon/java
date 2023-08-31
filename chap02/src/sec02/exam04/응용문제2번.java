package sec02.exam04;

import java.util.Scanner;

public class 응용문제2번 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("두개 숫자를 입력하세요");
		
		System.out.println("첫 번째 숫자는 무엇인가요?");
		int a = s.nextInt();
		
		System.out.println("두번 째 숫자는 무엇인가요?");
		int b = s.nextInt();
		
		int div = a / b;
		System.out.println("입력한 두수의 나눈결과는 :" + div + "입니다.");
		

	}

}
