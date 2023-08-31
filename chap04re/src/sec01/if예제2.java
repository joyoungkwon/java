package sec01;

import java.util.Scanner;

public class if예제2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("가수이름");
		String name = s.next();

		// 가수 이름 3글자 장문복, 이상이면 세번쨰글자
		// 가수 이름 두글자 면 두번쨰 글자 이상 - 상.
		// 가지고온것을 출력

		if (name.length() == 3) { // 문자열 길이 포문 안에말고도 if문에도 사용가능
			
				System.out.println(name.charAt(2)); // 0,1,2 뽑아 올 자릿수
			} else {
				System.out.println(name.charAt(1)); // 0,1
			}
			
			
			
		}

}
