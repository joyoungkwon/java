package sec02.exam04;

import java.util.Scanner;

// 이름이 홍길동이고 나이가 15살이면 - 홍길동은 청년입니다//
public class 응용문제4번 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("이름을 입력하세요");
		String name = s.next(); // 이름입력 //
		System.out.println("나이를 입력하세요");
		int age = s.nextInt(); // 나이입력 //

		if (age < 20) {
			System.out.println(name+"님은 청년입니다");	
		} else {
			System.out.println(name+"님은 장년입니다");	

		}
//  html 과 다르게 바디나 메인 메소드 말고 읽어 들이는 값으로 순서 맞추기 //
	}
}
