package sec01;

import java.awt.Toolkit;

public class BeepPrintExample2 {

	public static void main(String[] args) {
		
		Runnable beepTask = new BeepTask();//구현한객체생성
		Thread thread = new Thread(beepTask);//파라미터값이 Runnable인
		// 파라미터 클래스를 파라미터로넘김.
		thread.start();
		// 런을 호출하는메소드
		
		
		
		for(int i =0; i<5; i++) {
			System.out.println("띵");
			try {Thread.sleep(500);} catch(Exception e) {}
		}
	}

}
