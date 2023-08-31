package sec01;

public class CarExmaple {

	public static void main(String[] args) {
		int speed = 50;
		// 이게 자동차 스피드.
		Thread thread = new Thread(new Runnable() {
			int sum;
			@Override
			public void run() {
				for(int i = 1; i<=4; i++) {
					i*=50;
					sum= speed+i;
					try {Thread.sleep(300);} catch(Exception e) {}
					System.out.println("현재속도"+sum+"km");
				}
			}
		});
		thread.start();
		
		for(int i =1 ; i<=4; i++) {
			try {Thread.sleep(500);} catch(Exception e) {}
			System.out.println("속도를 올립니다.");
		}
		try {Thread.sleep(500);} catch(Exception e) {}
		System.out.println("차가 멈춥니다.");
	}

}
