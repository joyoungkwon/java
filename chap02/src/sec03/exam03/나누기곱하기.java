package sec03.exam03;

import java.util.Scanner;

public class 나누기곱하기 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("첫번째 숫자를 입력하세요");
		 int a= s.nextInt();
		 System.out.println("두번째 숫자를 입력하세요");
		 int b= s.nextInt();
		 
		System.out.println("연산기호를 입력하세요");
		String c=s.next();
		char d= c.charAt(0);
		
		if(d=='*'){
			int e = a *b; //if 구문에 다른 설정값 추가 곱하기여서 int 로 설정.//
			System.out.println("입력하신 연산의 결과는"+ e + "입니다.");
			
		} else {
			double f= (double) a/b ;// 나누기에는 소수점 형태 타입 double 변수 설정값 필요//
			System.out.println("입력하신 연산의 결과는"+f+"입니다.");
		}
		//char a='가'
		//char b =
		
		

	}
	//첫 번쨰 숫자를 입력하세요 // // scanner , if
	//두번째 숫자를 입력하세요//
	//연산입력기호를 입력하세요(*,/) - String 으로 받아서 chatAt으로 변경
	//입력하신 연산의 결과는 //
	

}
