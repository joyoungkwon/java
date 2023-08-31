package sec02;

public class InterrupExample {

	public static void main(String[] args) {
		
		
		PrintThread2 pThread2 = new PrintThread2();
		pThread2.start();// run 메소드 호출. 
		
		try {Thread.sleep(1000);} catch(InterruptedException e) {} // sleep 호출
		 
		pThread2.interrupt(); // Thread를 상속 받은 pThread2의
		// interrupt를 호출 함 
	}

}
