package sec02;

public class PrintThread1 extends Thread {
	private boolean stop; // boolean 타입 스탑 기본적으로 false;
	
	public void setStop(boolean stop) {
		this.stop = stop;  // 받아오는값
	}

	@Override
	public void run() { // run 메소드 오버라이드
		while(!stop) {
			System.out.println("ㅁ"); // 1초동안 실행되는 오버라이드
		}
		System.out.println("자원정리"); // 1초되면 자동정리
		System.out.println("실행종료"); // 실행종료
	}

}
