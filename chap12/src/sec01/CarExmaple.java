package sec01;

public class CarExmaple {

	public static void main(String[] args) {
		int speed = 50;
		// �̰� �ڵ��� ���ǵ�.
		Thread thread = new Thread(new Runnable() {
			int sum;
			@Override
			public void run() {
				for(int i = 1; i<=4; i++) {
					i*=50;
					sum= speed+i;
					try {Thread.sleep(300);} catch(Exception e) {}
					System.out.println("����ӵ�"+sum+"km");
				}
			}
		});
		thread.start();
		
		for(int i =1 ; i<=4; i++) {
			try {Thread.sleep(500);} catch(Exception e) {}
			System.out.println("�ӵ��� �ø��ϴ�.");
		}
		try {Thread.sleep(500);} catch(Exception e) {}
		System.out.println("���� ����ϴ�.");
	}

}
