package test;

import java.util.Scanner;

public class 확인문제re {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("당신의 이름은?");
		String name=s.next();
		
		System.out.println("중간고사 점수?");
		double mid = s.nextDouble();
		
		System.out.println("기말고사 점수?");
		double last = s.nextDouble();
		
		System.out.println("리포트 점수는?");
		double report = s.nextDouble();
		
		double mlr =(mid+last+report)/3;
		
		System.out.printf("%s님의 평균 점수는:%5.2f입니다.",name,mlr);
		
		
		
		// f실수 자리에는 .도 포함 ex) %5.2f= 12.45 
	}

}
//printf 사용 한번에 출력 평균 점수 double f
//19행 <숫자 d 스트링 타입 s(문자열)