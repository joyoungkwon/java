package qhrkd;

import java.util.Scanner;

public class splitEx {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in); //스캐너입력
		
		while(true) {
			System.out.println("게임을 시작합니다 >>");
			String str =s.nextLine();// 공백읽어오기 한줄.입력
			if(str.equals("그만")) {//그만조건
				System.out.println("종료");
				break;
			}else {
				System.out.println("어절개수는 :"+str.split("").length);
//				공백기준으로나눔.
			}
		}

	}

}
