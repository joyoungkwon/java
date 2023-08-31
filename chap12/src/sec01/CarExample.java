package sec01;

public class CarExample {

	public static void main(String[] args) {

		Thread thread = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					Thread.sleep(300);
				} catch (Exception e) {
				}
				System.out.println("현재속도 50km");
				try {
					Thread.sleep(300);
				} catch (Exception e) {
				}
				System.out.println("현재속도 100km");
				try {
					Thread.sleep(300);
				} catch (Exception e) {
				}
				System.out.println("현재속도 150km");
				try {
					Thread.sleep(300);
				} catch (Exception e) {
				}
				System.out.println("현재속도 200km");
			}
		});
		thread.start();
		
		try {
			Thread.sleep(100);
		} catch (Exception e) {
		}
		System.out.println("차가 출발합니다");
		try {
			Thread.sleep(200);
		} catch (Exception e) {
		}
		System.out.print("속도를올립니다.");
		try {
			Thread.sleep(250);
		} catch (Exception e) {
		}
		System.out.print("속도를올립니다.");
		try {
			Thread.sleep(250);
		} catch (Exception e) {
		}
		System.out.print("속도를올립니다.");
		try {
			Thread.sleep(250);
		} catch (Exception e) {
		}
		System.out.print("속도를올립니다.");
		try {
			Thread.sleep(500);
		} catch (Exception e) {
		}
		System.out.println("차가멈춥니다.");
	}

}
