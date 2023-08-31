package sec01;

public class SumExample {

	public static void main(String[] args) {

		// 1부터 10까지 홀수만 출력
		Runnable jsum = new JSum();
		Thread thread = new Thread(jsum);
		thread.start();

		// 1부터 10까지 짝수만 출력

		Thread tread1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				int j;
				for (j = 0; j <= 10; j++) {
					if (j % 2 == 0) {
						try {Thread.sleep(500);} catch (Exception e) {}
						System.out.println(j);
					}
				}
			}
		});
		tread1.start();
	}
}