package sec02;

import java.util.Scanner;

public class ConditionalOperationExamle {

	public static void main(String[] args) {
		int score =85;
		char grade =(score>90)? 'A':((score>80)?'B':'C');
		System.out.println(score +"점은"+grade+"등급입니다");
		//사용자 점수 입력
		// 점수가 90점 이상이면 "수" 80 점 이상이면 "우" 나머지는 "미"
		
		Scanner s = new Scanner(System.in);
		System.out.println("점수를 입력하세요");
		int a=s.nextInt();
		char grade2=(a>=90)?'수':((a>=80)?'우':'미');
		System.out.println(grade2);
		

	}

}
