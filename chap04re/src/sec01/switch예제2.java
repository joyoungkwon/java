package sec01;

import java.util.Scanner;

public class switch예제2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("학과코드를 입력하세요");
		String code =s.next();
																					//학과 코드는 A123, B123 식.
																					// 학과 코드의 첫자리가 A면 법학과 B면 경영학과 C국문학과
																					// 사용자가 A123 -> 입력하면 법학과 학생입니다.
																					// char 로 뽑아온 캐릭터 는 case에 ''작은 따옴표로 묶음//
		char code2 = code.charAt(0);
		
		switch(code2) {
			case 'A' :
				System.out.println("법학과");
				break;
			case 'B' :
				System.out.println("경영학과");
				break;
			case 'C':
				System.out.println("국문학과");
				break;
		}
	}

}
