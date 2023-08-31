package sec01;

public class wakeUp implements Runnable{ // Runnable 인터페이스 를 구현시키는 클래스.

	@Override
	public void run() {
		try {Thread.sleep(300);} catch(Exception e) {} // 딜레이 딜레이 순서 바뀌면 바뀌는 순서도 바뀜.
		System.out.println("기상합니다.");
	}

}
