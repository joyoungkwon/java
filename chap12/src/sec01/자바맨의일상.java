package sec01;

import java.util.Calendar;

public class �ڹٸ����ϻ� {

	public static void main(String[] args) {
		
		
		Calendar now = Calendar.getInstance(); // Ķ���� �ν��Ͻ� �޾ƿ���
		int yer = now.get(Calendar.YEAR); // Ķ���� ���� �⵵ �޾ƿ��� 
		int month = now.get(Calendar.MONTH)+1;// Ķ���� ���� �� �޾ƿ��� +1 �߿�(���ݴ�).
		int day = now.get(Calendar.DAY_OF_MONTH); // Ķ���� ������ �״��� ��¥�� �޾ƿ���.
		// Calendar = getInstacne �� �޾ƿͼ����� ���� , get �޼ҵ�� �޾ƿ�����.
		// set �޼ҵ� �� ������ �����ϰ� ������ ������ ���� get���� �޾ƿü��� ����

		for(int i =0; i<2; i++) { // �ڵ� ���̱� �����ڵ� x=2 x����ŭ �ݺ�
		try {Thread.sleep(200); 
		System.out.println("������"+yer+"��"+month+"��"+(day+i)+"��");
		
		Runnable wake = new wakeUp();
		Thread thread1 = new Thread(wake);
		thread1.start(); // Runnable �� �������Ѽ� ���� Ŭ�����̱� ������
		//������ Runnable ��ü�� ���� ���������
		
		Thread stu = new Thread(new Runnable() {// �͸� ��ä�� ���ٷ� ���� (�ܹ߼� ��ȸ��) (for �������.)
			@Override
			public void run() {
				System.out.println("�����մϴ�.");
				try {Thread.sleep(400);} catch (Exception e) {}
			}
		}); // �͸� ��ä�� ���ٷ� ���� (�ܹ߼� ��ȸ��) (for �������.)
		stu.start(); // ȣ��޼ҵ�
		
		Thread  thread2 = new Sleep();
		thread2.start();
		// ��� extends  �ϸ� ���ٷ� ������ ����.
		
		
		Thread.sleep(500);
		} catch(Exception e) {}
		}
		
	}
}
