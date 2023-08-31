package sec02;

import java.util.Scanner;

public class 팀과제 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("학생수");
		int student = s.nextInt();
		System.out.println("한줄에 몇명씩 앉고있나");
		int line = s.nextInt();

		int result1 =student/line;
		int result2 =student%line;

		int result3 = (student % line == 0) ? student / line : student / line + 1;
		int result4 = (student % line == 0) ? student % line : line - student % line;
		System.out.printf("총 %d줄이고 남은좌석수는%d개입니다", result1, result2);
		}

		
	}

//"총%줄이고 남은 좌석의 수는0개입니다."