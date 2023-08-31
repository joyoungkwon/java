package sec01;

public class ThreadNameExmaple {

	public static void main(String[] args) {
		
		Thread  mainThread = Thread.currentThread();
		System.out.println("기본 스레드의 이름 : "+ mainThread.getName());
		
		ThreadA threadA = new ThreadA();
		System.out.println("지금 작업하는 쓰레드 A의 이름은 :"+ threadA.getName());
		threadA.start();
		ThreadB threadB = new ThreadB();
		System.out.println("지금 작업하는 쓰레드 B의 이름은 :"+ threadB.getName());
		threadB.start();
		// 스레드의 메인 이후에 인덱스 값은 배열과 같이 0
		
	}

}
