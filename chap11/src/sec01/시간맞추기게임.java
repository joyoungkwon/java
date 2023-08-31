package sec01;

import java.util.Calendar;
import java.util.Scanner;

public class 시간맞추기게임 {
	private String Enter; //필드
	private int time;

	public int Start() { // int return 값이 있는 시간맞추기게임의 메소드.
		Scanner s = new Scanner(System.in); // Scanner 를 임포트
		Enter = s.nextLine(); // 엔터로 넘기는. // Enter nextline 으로 공백인 한줄을 건너 뛰기.
		Calendar now = Calendar.getInstance(); // 캘린더객체 생성 Api
		time = now.get(Calendar.SECOND); // time 지금 시간. (Api)중에 지금 시간을 풀러오는 api을 time 에 저장
		System.out.println("현재시각:" + time + "초입니다"); // 지금 시간을 뽑아온걸 time 으로 받아오고 결과값을 출력하는 메소드.
		return time;// time 의 값을 return;.

	}

	public static void main(String[] args) { // main 
		시간맞추기게임 game = new 시간맞추기게임(); // 시간맞추기게임의 객체를 game 에 저장.
		String names[] = { "홍길동", "장동건" }; // String 타입의 names라는 배열을 생성하고 "홍길동과""장동건"을 저장. 
		int time1, time2; // int time1과 int time2 을 선언.
		int times[] = new int[2]; // time 끝 시작 시간을 저장할 배열

		System.out.println("10초에 가까운 사람이 이기는 게임입니다."); //메인구문 반복 필요 x였음. (반복이 필요하면 반복문 안으로 넣기)
		for (int i = 0; i < 2; i++) { // for 2가 i보다 클때까지 반복 
			System.out.println(names[i]+" 시작키 enter");// 홍길동의 시간을 time1로 시작으로 매김.(순서대로)
			//  line -33 시간맞추기게임이라는 클래스 안에 Start(); 메소드 호출 하고 time1로 대입.
			// Start 는  = 값을 Enter로 넘기고 (한줄공백nextLine) Calendar API의 getInstance()로 받는 메소드를 받고.
			// time 이라는 변수로 now.get(Calendar.SECOND); 이라는 현재 시각을 가지고오고, 출력구문으로 확인하며, time 의 결과값을 리턴 시키는
			// Start라는 메소드 line -33 end
			 time1 = game.Start();
			 System.out.println(names[i]+"10초 예상후 enter");
			 time2 = game.Start(); // line 33 번의 설명 과 같음, 
			if (time1 > time2) { // for안의 if 조건문. time1(홍길동)의 값이 장동건time2(장동건)의 값보다 클땐.
				times[i] = (time2 + 60) - time1; // times[i] 번째에 (time2 + 60) - time1 ; 의 값을 저장. 
				// 
			} else {
				times[i] = time2 - time1;// (아니면 times[i] 번째에 time2 - time1;을 저장.
			}

		}
		if( times[0] > times[1] || times[1] >10) { // 조건문 time[0]번째 방이 times[1]방보다 크거나 times[1] 번 방이 10 보다 크거나 하면
			System.out.println("홍길동 의 결과"+ times[0]+"초 장동건 의 결과"+times[1]+"승자는 홍길동"); 
			
		}else {
			System.out.println("홍길동 의 결과"+ times[0]+"초 장동건 의 결과"+times[1]+"승자는 장동건");
		}
	}
}
