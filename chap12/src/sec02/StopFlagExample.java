package sec02;

public class StopFlagExample {

	public static void main(String[] args) {
		PrintThread1 printThread = new PrintThread1(); // ������ ��� ���� ����Ʈ ������ ��� ����
		printThread.start(); // ������ ��� Ŭ���� �޼ҵ� run ���� ȣ�� �޼ҵ�
		
		try {Thread.sleep(1000);} catch(InterruptedException e) {} // ����ó�� ������ �� �ִ� sleep �޼ҵ� �⺻������
		//InterruptedException �̶�� ���� �� ĳġ�� ��°� ������.
		
		printThread.setStop(true); // ����Ʈ �������� set stop�̶�� boolean �� �ݺ��� ���� true ������ ����
		
		PrintThread2 pThread2 = new PrintThread2();
		pThread2.start();
	}

}
