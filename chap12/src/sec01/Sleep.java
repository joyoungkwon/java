package sec01;

public class Sleep extends Thread{

	@Override
	public void run() {
		try {Thread.sleep(500);} catch (Exception e) {}
		System.out.println("������ϴ�.");
	}

}
