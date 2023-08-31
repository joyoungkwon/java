package sec01;

import java.util.Scanner;

public class switch예제1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("가수이름");
		String name = s.next();
		System.out.println("가수평점");
		int point = s.nextInt();

		String grade;

		switch (point) {
		case 10:
		case 9:
		case 8:
			grade = "최상급";
			break;
		case 7:
		case 6:
		case 5:
			grade = "중급";
			break;
		default:
			grade = "하급";
		}
		System.out.println(name + "님의 등급은 " + grade + "입니다.");
	}

}
