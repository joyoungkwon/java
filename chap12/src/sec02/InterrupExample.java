package sec02;

public class InterrupExample {

	public static void main(String[] args) {
		
		
		PrintThread2 pThread2 = new PrintThread2();
		pThread2.start();// run �޼ҵ� ȣ��. 
		
		try {Thread.sleep(1000);} catch(InterruptedException e) {} // sleep ȣ��
		 
		pThread2.interrupt(); // Thread�� ��� ���� pThread2��
		// interrupt�� ȣ�� �� 
	}

}
