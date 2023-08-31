package sec02;

public class StopFlagExample {

	public static void main(String[] args) {
		PrintThread1 printThread = new PrintThread1(); // 스레드 상속 받은 프린트 스레드 상속 받음
		printThread.start(); // 스레드 상속 클래스 메소드 run 실행 호출 메소드
		
		try {Thread.sleep(1000);} catch(InterruptedException e) {} // 예외처리 스레드 에 있는 sleep 메소드 기본적으로
		//InterruptedException 이라는 예외 를 캐치로 잡는게 보편적.
		
		printThread.setStop(true); // 프린트 스레드의 set stop이라는 boolean 값 반복문 실행 true 맞으면 멈춤
		
		PrintThread2 pThread2 = new PrintThread2();
		pThread2.start();
	}

}
