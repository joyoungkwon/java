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
				System.out.println("����ӵ� 50km");
				try {
					Thread.sleep(300);
				} catch (Exception e) {
				}
				System.out.println("����ӵ� 100km");
				try {
					Thread.sleep(300);
				} catch (Exception e) {
				}
				System.out.println("����ӵ� 150km");
				try {
					Thread.sleep(300);
				} catch (Exception e) {
				}
				System.out.println("����ӵ� 200km");
			}
		});
		thread.start();
		
		try {
			Thread.sleep(100);
		} catch (Exception e) {
		}
		System.out.println("���� ����մϴ�");
		try {
			Thread.sleep(200);
		} catch (Exception e) {
		}
		System.out.print("�ӵ����ø��ϴ�.");
		try {
			Thread.sleep(250);
		} catch (Exception e) {
		}
		System.out.print("�ӵ����ø��ϴ�.");
		try {
			Thread.sleep(250);
		} catch (Exception e) {
		}
		System.out.print("�ӵ����ø��ϴ�.");
		try {
			Thread.sleep(250);
		} catch (Exception e) {
		}
		System.out.print("�ӵ����ø��ϴ�.");
		try {
			Thread.sleep(500);
		} catch (Exception e) {
		}
		System.out.println("��������ϴ�.");
	}

}
