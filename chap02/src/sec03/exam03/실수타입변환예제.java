package sec03.exam03;

import java.util.Scanner;

public class 실수타입변환예제 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("중간고사 성적을 입력하세요");
		Double a = s.nextDouble();
		System.out.println("기말고사 성적을 입력하세요");
		Double b = s.nextDouble();
		Double c = a + b;
		
		System.out.println("최종성적은 "+ c + "입니다.");
	}

}
