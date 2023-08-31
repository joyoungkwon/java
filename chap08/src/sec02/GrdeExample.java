package sec02;

import java.util.Scanner;

public class GrdeExample {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		
		System.out.println("수학,과학,영어, 순으로 입력하세요.");
		int math = s.nextInt();
		int science = s.nextInt();
		int english = s.nextInt();
		Grade me = new Grade(math,science,english);
		
		System.out.println("평균은"+me.average());
		
	}

}
