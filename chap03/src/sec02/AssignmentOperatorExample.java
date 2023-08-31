package sec02;

import java.util.Scanner;

public class AssignmentOperatorExample {

	public static void main(String[] args) {	
		Scanner s = new Scanner(System.in);
		int num1 =100;
		System.out.println("숫자 입력 하세요");
		int a = s.nextInt();
		System.out.println("연산자 입력하세요");
		String b =s.next();
		if(b.equals("+")) {num1+=a;}
		if(b.equals("-")) {num1-=a;}
		if(b.equals("*")) {num1*=a;}
		if(b.equals("/")) {num1/=a;}
		if(b.equals("%")) {num1%=a;}
		
		System.out.println(num1);

		
	}

}
// 스캐너 이용해서 숫자 입력받기
// 숫자 변수에 담기 num1에 담기
// 연산자 스캐너 입력받기
// 스트링 타입의 변수로 저장하기 next
// if문에 뭐 들어갈지 생각하기 and or xor
// if 문 작성 하기 , +,-,*,/,%
