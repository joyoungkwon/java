package sec02;

import java.util.Scanner;

public class 계산기 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		
		System.out.println("첫번째 수입력");
		int a=s.nextInt();
		System.out.println("두번째 수입력");
		int b=s.nextInt();
		System.out.println("연산자 입력");
		String c= s.next();
		if(a>b) {
			int temp;
			int result;
			double result2;
		}
		if(c.equals("+")) {
			int p = a+b;
			System.out.println("덧셈은"+p);
		}
		if(c.equals("-")) {
			int m = a+b;
			System.out.println("뺄샘은"+m);
		}
		if(c.equals("*")) {
			int dd = a+b;
			System.out.println("곱셈은"+dd);
		}
		if(c.equals("/")) {
			double f = a/b;
			double ff = a%b;
			System.out.printf("두수의 나눗셈은%s고나머지는%f입니다.",f,ff);
		}
			 

	}

}
