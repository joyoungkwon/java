package sec02;

import java.util.Scanner;

public class 확인문제2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("근로시간을 입력하세요");
		int a =s.nextInt();
		
		int b = a*9620;
		double c = (a>=10)? b*1.2:b;
		System.out.println((int)c);
		
		

	}

}
