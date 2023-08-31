package sec01;

import java.util.Scanner;
import java.util.*;

public class qz {
	Scanner s = new Scanner(System.in);//스캐너
	
	List<ArrayL> list = new ArrayList<>();// 클래스 객체 로 Array넘김
	int[] qznum = new int[4]; // 예제로 나올 4개짜리 보기.

	public qz() { // ArrayL list에 add로 추가.
		// 그래서 ArrayL에 가지고 있는값.
		list.add(new ArrayL("A", "에이")); // ArrayL의 클래스에 생성자 값. add로 추가
		list.add(new ArrayL("B", "비"));
		list.add(new ArrayL("C", "시"));
		list.add(new ArrayL("D", "디"));
		list.add(new ArrayL("E", "이"));
		list.add(new ArrayL("F", "에프"));
		list.add(new ArrayL("G", "쥐"));
	}

	public void run() { // qz에 run이라는 메소드
		boolean start = true;
		System.out.println("누가누가 잘맞추기 게임을 시작합니다. \n" + 
		list.size() + "의 단어가 저장되어 있습니다\n -1을 누르면 종료됩니다.");
		int num = 0; // 맞춘값 출력 초기화
		while (start) { 
			randomqz(); // list에 저장되어 있는 난수  값을 보기로 나오게 하는 메소드
			// (중복제거된)
			int answeNum = (int) (Math.random() * qznum.length);
			// answeNum 의 난수 값 qznum 예제 길이만큼. 
			//난수 생성 1,2,3,4 중에 랜덤.

			int answerIndex = qznum[answeNum];
			// 문제 생성

			System.out.println(list.get(answerIndex).getEng());

			for (int i = 0; i < qznum.length; i++) { //예제의 길이만큼 돌아가는 포문
				System.out.println((i + 1) + list.get(qznum[i]).getKor()); 
			}
			System.out.println(">>");

			int input = s.nextInt();
			if (input == -1) {
				System.out.println(num + "종료");
				break;
			} else if (input - 1 == answeNum) {
				System.out.println("정답");
				num++;
			} else {
				System.out.println("오답.");

			}
		}

	}

	public void randomqz() { //예제로 뽑아오는 메소드
		for (int i = 0; i < 4; i++) { //네번반복
			qznum[i] = (int) (Math.random() * list.size()); // int 타입 qznum의 배열에
			//i번째 인덱스 마다 범위가 ArrayList list 에 저장되어있는 값의 길이만큼 
			// 저장후 리턴
			for (int j = 0; j < i; j++) { // 2중 포문.
				if (qznum[i] == qznum[j]) { // if qznum[i] 번째 방이랑 qzum[j]번째 방의 값이 같으면
					// i를 마이너스 해서 포문을 가지고 있던 값 그대로 다시 윗포문을 타게함.
					
					i--;
					continue;
				}
			}
		}
	}
}
