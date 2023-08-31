package sec01;

import java.util.Calendar;

public class 자바맨의일상 {

	public static void main(String[] args) {
		
		
		Calendar now = Calendar.getInstance(); // 캘린더 인스턴스 받아오기
		int yer = now.get(Calendar.YEAR); // 캘린더 지금 년도 받아오기 
		int month = now.get(Calendar.MONTH)+1;// 캘린더 지금 달 받아오기 +1 중요(지금달).
		int day = now.get(Calendar.DAY_OF_MONTH); // 캘린더 지금의 그달의 날짜를 받아오기.
		// Calendar = getInstacne 로 받아와서생성 가능 , get 메소드로 받아오지만.
		// set 메소드 로 설정도 가능하고 셋으로 설정한 값을 get으로 받아올수도 있음

		for(int i =0; i<2; i++) { // 코드 줄이기 위한코드 x=2 x값만큼 반복
		try {Thread.sleep(200); 
		System.out.println("오늘은"+yer+"년"+month+"월"+(day+i)+"일");
		
		Runnable wake = new wakeUp();
		Thread thread1 = new Thread(wake);
		thread1.start(); // Runnable 을 구현시켜서 만든 클래스이기 때문에
		//별도에 Runnable 객체를 생성 시켜줘야함
		
		Thread stu = new Thread(new Runnable() {// 익명 객채로 막바로 쓰기 (단발성 일회성) (for 사용이유.)
			@Override
			public void run() {
				System.out.println("공부합니다.");
				try {Thread.sleep(400);} catch (Exception e) {}
			}
		}); // 익명 객채로 막바로 쓰기 (단발성 일회성) (for 사용이유.)
		stu.start(); // 호출메소드
		
		Thread  thread2 = new Sleep();
		thread2.start();
		// 상속 extends  하면 막바로 대입후 실행.
		
		
		Thread.sleep(500);
		} catch(Exception e) {}
		}
		
	}
}
