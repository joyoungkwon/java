package sec03;

import java.util.Scanner;

public class 끝말잇기 {

	public static void main(String[] args) {
////		// 끝말잇기. 스캐너 입력 . 참가 하는 인원을 받음.
////		// 참가를 입력 하는 거에 따라 . 입력한 이름값. 수 생성. []배열
////		// 반복 하게 하기
////		// 첫 제시어가 "아버지"
		Scanner s = new Scanner(System.in);
		System.out.println("끝말잇기 게임을 시작합니다.");
		System.out.print("인원수를 입력하세요" + ">>");
		int playerNum = s.nextInt();
		String name[] = new String[playerNum]; // 선언 대입 한번에.

		// 스트링의 배열만큼 플레이어의 이름을 입력하면 됌.
		for (int i = 0; i < playerNum; i++) { // 플레이어의 참가 수만큼 포문이 반복.
			System.out.print("플레이어 이름 입력");
			String playerName = s.next();
			name[i] = playerName;
		} // 포문 종료

		String word = "아버지";
		System.out.println("시작단어는 아버지입니다.");
		O:while (true) {
			for(int i=0; i<name.length; i++) {
				int lastIndex = word.length() - 1; 			 // 배열은 제로 인덱스 문자열은 123 이니깐 배열 인덱스 값에 넣을려고 -1
				char lastChar = word.charAt(lastIndex); 	// 캐릭터 타입 '' 하나의 인덱스 마지막 번호를 뽑아오고 저장 시킨다.
				System.out.print(name[i] +" >> ");
			
			String inputWord = s.next();
			if (inputWord.charAt(0) != lastChar) {
				System.out.println("끝말잇기 종료");
				break O;
			}else {
				word=inputWord;
			}
		}
		
	}

	}

}
