package sec03.exam07;

import java.util.Scanner;

public class 확인문제1 {
// 돈 = 돈 % < 나머지
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println(" 돈의 액수를 입력하세요");
		
		int a = s.nextInt();
		System.out.println("오만원권 :"+ a/ 50000 + "개");
		a = a% 50000;
		System.out.println("만원권 :"+ a / 10000 +"개");
		a= a% 10000;
		System.out.println("천원권 :"+a/1000+"개");
		a= a% 1000;
		System.out.println("백원짜리동전 :"+a/100+"개");
		a= a % 100;
		System.out.println("십원짜리 동전 :"+a/10+"개");
		a= a % 10;
		System.out.println("일원짜리 동전:"+a/1+"개");
		a= a % 1;
		
		

	}

}
