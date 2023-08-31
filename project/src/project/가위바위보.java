package project;

import java.util.Scanner;

public class 가위바위보 {

	public static void main(String[] args) {
		// 컴퓨터와 가위바위보를 합니다.
		// 사용자가 가위 바위 보를 입력합니다. // Scanner 입력
		// 컴퓨터는 가위 바위 보 중에서 랜덤하게 하나를 선택합니다 // 랜덤 메소드 뽑아오기
		// 사용자 입력과 컴퓨터 선택을 비교 해서 누가 이겼는지 출력 // 랜덤 메소드를 비교
		// 사용자가 "그만"입력시 게임 끝 // 그만입력시 멈춤.
		// 반복 조건 배열. // while 문 switch 문

//		(Math.random() ) 랜덤 숫자 입력.
		Scanner s = new Scanner(System.in);
		String game[] = { "가위", "바위", "보" };
		while (true) {
			System.out.println("가위바위보 시작");
			System.out.println("그만입력시 종료");
			String userd = s.next();
			if (userd.equals("그만")) {
				System.out.println("종료합니다.");
				break;
			}
			System.out.println("내가 뽑은값" + userd);
			int let = game.length;
			String com = game[(int) (Math.random() * let)];
			System.out.println("컴퓨터가 뽑은 값 " + com);
			if (userd.equals(com)) {
				System.out.println("비겼습니다.");
			} else if (userd.equals(game[0]) && com.equals(game[2]) || userd.equals(game[1]) && com.equals(game[0])
					|| userd.equals(game[2]) && com.equals(game[2])) {
				System.out.println("이겼습니다.");
			}else {
				System.out.println("졌습니다.");
			}
		}

	}

}
