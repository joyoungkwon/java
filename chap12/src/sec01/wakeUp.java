package sec01;

public class wakeUp implements Runnable{ // Runnable �������̽� �� ������Ű�� Ŭ����.

	@Override
	public void run() {
		try {Thread.sleep(300);} catch(Exception e) {} // ������ ������ ���� �ٲ�� �ٲ�� ������ �ٲ�.
		System.out.println("����մϴ�.");
	}

}
