package sec01;

import java.util.Scanner;

public class 연산우선순위 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("첫번째 숫자를  입력하세요");
		int num1 = s.nextInt();
		System.out.println("두번째 숫자를  입력하세요");
		int num2 = s.nextInt();
		int sum = num1+num2;
		 String result = (sum>50)?"통과":"탈락";
		 System.out.println(result);
		
		
		
		// 2 삼항 연산자를 사용 하여 두수의 합이 50이면"통과"
		//2 50미만 이면" 탈락" 을 출력하시오
		
		//1만약 연산자가 +면 입력한 숫자에서 1을 증가시켜 출력 하고
		// 1연산자가 -면 입력한 숫자에서 1을 감소 시켜 출력하세요
	}

}
