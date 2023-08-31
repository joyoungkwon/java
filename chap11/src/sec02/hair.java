package sec02;

import java.util.Calendar;
import java.util.Scanner;

public class hair {

	public static void main(String[] args) {
		// 사용자 이름입력
		// 미용실 이용항목 입력
		// 커트 -8000 파마 20000 염색 25000 매직 60000
		// if 방문 시간이 오전이면 30%할인 오후면 10% 할인오전 0 오후 1
		// 나머지면 할인 x
		
		Scanner s = new Scanner(System.in);
		System.out.println("사용자 입력 ");
		String name = s.next();
		System.out.println("이용하는 스타일입력");
		String hair = s.next();
		Calendar now = Calendar.getInstance();
		int sum = 0;
		int total =0;
		
		switch(hair) {
		case "커트":
			sum+=8000;
			break;
		case "파마":
			sum+=20000;
			break;
		case "염색":
			sum+=25000;
			break;
		case "매직":
			sum+=60000;
			break;
		}
		int hour = now.get(Calendar.HOUR);
		int ampm = now.get(Calendar.AM_PM);
		if(hour<12 && ampm==0) {
			sum *=0.7;
		}else if(hour<6 && ampm==1) {
			sum *=0.9;
		}
		System.out.println(name+"님의 결제금액은"+sum+"원입니다.");
	}

}
