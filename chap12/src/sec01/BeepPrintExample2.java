package sec01;

import java.awt.Toolkit;

public class BeepPrintExample2 {

	public static void main(String[] args) {
		
		Runnable beepTask = new BeepTask();//�����Ѱ�ü����
		Thread thread = new Thread(beepTask);//�Ķ���Ͱ��� Runnable��
		// �Ķ���� Ŭ������ �Ķ���ͷγѱ�.
		thread.start();
		// ���� ȣ���ϴ¸޼ҵ�
		
		
		
		for(int i =0; i<5; i++) {
			System.out.println("��");
			try {Thread.sleep(500);} catch(Exception e) {}
		}
	}

}
