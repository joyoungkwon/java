package asd;

import java.util.Scanner;

public class 계산기 {
	   public static void main(String[] args) {
	      Scanner s = new Scanner(System.in);
	      int result=0; // 초기화
	      System.out.print("두 정수와 연산자를 입력하시오 >> "); // 입력 
	      int a = s.nextInt(); //a 
	      int b = s.nextInt(); //b
	      char c = s.next().charAt(0); // 연산자. 첫번째 +,-,*,/
	      Calc cal; // 추상클래스
	      switch(c) { // 스위치로 입력한 값이랑 대조.(선택문)
	      case '+' : 
	         cal = new Add();
	         break;
	      case '-' :
	         cal = new Sub();
	         break;
	      case '*' :
	         cal = new Mul();
	         break;
	      case '/' :
	         cal = new Div();
	         break;
	      default :
	         System.out.println("잘못된 연산자 입니다.");
	         return; // 다른거 입력시.
	      }
	      cal.setValue(a, b); // 추상 호출
	      result = cal.calculate(); // 상속받은 각 클래스의 오버라이드한 메소드 호출 하고 result의 저장.
	      System.out.println(result);
	   }
	}