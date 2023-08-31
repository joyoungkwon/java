package sec02;

public class PrintThread2 extends Thread {
	

//	public void run() { // run 메소드 오버라이드 start()로 호출
//		try {
//			while(true) {
//				System.out.println("실행중");
//				Thread.sleep(1);
//			}
//		} catch (InterruptedException e) { // pThread2.interrupt
//			//라는 메인 스레드의 호출로 예외를 발생시켜서 종료 시킴
//			// while 이라는 반복문은 횟수가 정해지지않고, 종료값이 false기 때문에
//			// 예외로 종료시킴.
//			System.out.println(e.getMessage());
//			// 예외변수 e의 get메소드로 메세지 받아오기.
//		}
//		System.out.println("자원정리");
//		System.out.println("실행정리");
//}
	@Override
	public void run() { // run 메소드 오버라이드 start()로 호출
		while(true) {
			System.out.println("실행중");
			if(Thread.interrupted()) { // 
				// interrupt 호출여부
				break;
			}
		}
		System.out.println("자원정리");
		System.out.println("실행종료");
	}
}