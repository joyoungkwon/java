package sec01;

import java.awt.Toolkit;

public class BeepTask implements Runnable{

	@Override // Runnable 구현 후 하나있는 run메소드를 불러와 쓰고자하는 걸로 재정의
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit(); 
		for(int i = 0; i<5; i++) {
			toolkit.beep();
			try {Thread.sleep(500);} catch(Exception e) {}
		}
	}

}
