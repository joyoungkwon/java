package project;

import java.util.Scanner;

public class 반복연습2 {
	// 컴퓨터, 나 윳놀이 게임 (도,개,걸,윷,모)
	// 첫 출력 1- 게임 시작 2-게임종료.
	// 1을 누르면 나와 컴퓨터가 랜덤으로 숫자를 뽑아냄 1도 2개 3걸 4윷 5모
	// 뽑아낸 결과를 출력. ex) 나 : 도 컴퓨터 : 걸
	// 당신이이겼습니다. 당신이 졌습니다. 같습니다.
	
	
	

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); //스캐너
		playGame gg = new playGame();	 // 

		int computer; // 컴퓨터 안에 넣을 변수
		int my; // 내가 뽑을 변수

		boolean game = true; // while 문 돌릴려고 만든 true 
		while (game) { // game true 
			System.out.println("윷놀이 게임을 시작합니다.");  // 반복
			System.out.println("1은 게임 시작 2는 게임 종료 입니다."); // 반복
			int start = s.nextInt(); // while 문 반복 

			if (start == 1) { // 1을 입력해서 넘어오는 조건
				computer = (int) (Math.random() * 5) + 1; // computer 변수 에 int 로 타입변환한 math.random메소드 (0~5까지)+1= 1부터 5까지 
				System.out.println("컴퓨터의 값은" + computer); // 뽑아온 숫자 출력해서 보여주기
				
				my = (int) (Math.random() * 5) + 1; // my 변수에 랜덤 숫자 1부터 5까지 뽑아오기
				System.out.println("나의 값은" + my); // 내가 뽑아온 숫자 출력해서 결과 보기
				
				gg.play("computer", computer); // switch 에서 1-도 2-개 3-걸 4-윷 5-모 숫자 1부터 5까지 case 로 도,개,걸 , 윷, 모 바꿈
				gg.play("my", my); // switch 에서 1-도 2-개 3-걸 4-윷 5-모 숫자 1부터 5까지 case 로 도,개,걸 , 윷, 모 바꿈
				
				if(my==computer) { // while 문 안에 if
					System.out.println("비겼습니다."); // 같을때
				}else if(my>computer) {
					System.out.println("당신이 이겻습니다"); // my가 컴퓨터보다 클때
				}else {
					System.out.println("컴퓨터가 이겼습니다"); // my보다 컴퓨터가 클때
				}
			}else {
				System.out.println("게임을 종료합니다");
				game =false; // if 문 빠져나와서 while 문에서 boolean game 변수 (true) 를 false; 로 바꿔서 종료
			}
		}
	}
}