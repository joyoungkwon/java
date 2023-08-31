package sec04;

import java.util.Scanner;

// 서울 -10 부산 -5 화순 -5
public class 여행 {

	public static void main(String[] args) {
		// 초기 세팅값 광주. oil 값 20
		Scanner s = new Scanner(System.in);
		Travel tvr = new Travel();

		tvr.setOil(20);
		tvr.setLocation("광주");

		while (true) {
			String tvr2 = s.next();
			if (tvr2.equals("서울")) {
				tvr.oilMinus(10);
				tvr.setLocation("서울");
				tvr.isoilLeft();
				System.out.println("현재 위치는:" +tvr.getLocation() );
				System.out.println("남은 오일 잔여량은:"+tvr.getOil());
			}

			if (tvr2.equals("부산")) {
				System.out.println("부산");
				tvr.oilMinus(5);
				tvr.setLocation("부산");
				tvr.isoilLeft();
				System.out.println("현재 위치는 "+ tvr.getLocation());
				System.out.println("남은 오일 잔여량은:"+tvr.getOil());
			}

			if (tvr2.equals("화순")) {
				System.out.println("화순");
				tvr.oilMinus(5);
				tvr.setLocation("화순");
				tvr.isoilLeft();
				System.out.println("현재위치는:"+ tvr.getLocation());
				System.out.println("남은 오일 잔여량은:"+tvr.getOil());
			}

		}
		
	}

}
