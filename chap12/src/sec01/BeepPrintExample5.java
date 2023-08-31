package sec01;

import java.awt.Toolkit;

public class BeepPrintExample5 {

	public static void main(String[] args) {
		Thread thread = new Thread(new Runnable() {

			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for (int i = 0; i < 5; i++) {
					toolkit.beep();
					try {
						Thread.sleep(500);
					} catch (Exception e) {
						System.out.println("에러"); // 에러없으면 안함
					}
				}
			}
		});
		thread.start();
		
		
		for(int i =0; i<5; i++) {
			System.out.println("강사님 기여오");
			try {Thread.sleep(500);} catch (Exception e ) {}
			
		}
	}

}
