package sec02;

import java.util.Scanner;

public class 확인문제9 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("첫번째 실수를 입력하세요");
		String strf1=s.next();
		System.out.println("두번째 실수를 입력하세요");
		String strf2 = s.next();
		
		float f1 = Float.parseFloat(strf1);
		float f2 = Float.parseFloat(strf2);
		
		
		
		
		
		
		if(f2==0 ) {
			System.out.println("무한대:값");
			
		}else {
			float f3 = f1/f2;
			System.out.println(f3);
		}
		
		
		
		/*
		double x = Double.parseDouble(strf1);
		double y = Double.parseDouble(strf2);
		double result = x / y;
		
		if(y == 0 || y == 0.0) {
			System.out.println("결과값 : 무한대");
		}else {
			System.out.println("결과값 : " + result);
		}
		*/
		
		
		
		

	}
	// 실수 숫자 두개를 받고
	// 입력된 첫번째 수에 두번째 수를 나눈 결과를 결과값 출력
	// 두번째 수에 0또는 -.00이 입력 되었을 경우, 결과 출력이 "결과 : 무한대"가 되도록 코드 작성 (scanner next 를 사용)
}
