package sec02;

import java.util.Calendar;
import java.util.Scanner;

public class ekffurcnffur {

	public static void main(String[] args) {

		// 필요한거 연도 , 시작 날짜, 마무리 날짜 .
		// 연도랑 달 입력 받기 그안에 시작날짜

		Scanner s = new Scanner(System.in);
		Calendar now = Calendar.getInstance();
		System.out.println("연도입력하세요");
		int year = s.nextInt();
		System.out.println("달을 입력하세요");
		int month = s.nextInt();
		System.out.println();

		Calendar start = Calendar.getInstance();// 처음 시작 날짜정보 가져옴
		Calendar end = Calendar.getInstance();// end도 로딩한 시점의 날짜정보가져옴
		start.set(year, month - 1, 1); // 위에서 현 시간을 끌어왔다가 우리가 스캐너로
		//받은 걸로 파라미터를 바꿔치기함.
		end.set(year, month, 1);
		end.add(Calendar.DATE, -1);// 
		
		int dayweek = start.get(Calendar.DAY_OF_WEEK);
		System.out.println();
		System.out.println("============"+month+"=============");
		System.out.println("일 월 화 수 목 금 토");
		
		for(int i = 1; i<dayweek; i++) {
			System.out.println("   ");
		}
		
		for(int i =1 ,j =dayweek; i<=end.get(Calendar.DATE); i++,j++) {
			System.out.printf("%3d",i);
			
			if(j%7==0) {
				System.out.println();
			}
		}

	}

}
