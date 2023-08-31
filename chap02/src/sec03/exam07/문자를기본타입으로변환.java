package sec03.exam07;

import java.util.Scanner;

public class 문자를기본타입으로변환 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("첫번째숫자를 입력하세요");
		String a=s.next();
		System.out.println("두번째숫자를 입력하세요");
		String b=s.next();
		
		int c = Integer.parseInt(a);
		int d = Integer.parseInt(b);
		int sum = c + d;
		System.out.println("두 수의 합계는:"+ sum +"입니다.");
		
		
		

	}
//두 수를 입력 받습니다 단, next()를 이용하여 문자열로 입력 받습니다//
	//입력받은 문자를 parselnt 이용하여
	//숫자로 형변환 시켜라
	//두숫자의 합계를 출력해라//
	//Integer.parseInt 문자열 > 숫자 (int)변환//
	//String.valueOf(타입값) 타입값 > 문자
}
