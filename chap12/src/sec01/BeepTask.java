package sec01;

import java.awt.Toolkit;

public class BeepTask implements Runnable{

	@Override // Runnable ���� �� �ϳ��ִ� run�޼ҵ带 �ҷ��� �������ϴ� �ɷ� ������
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit(); 
		for(int i = 0; i<5; i++) {
			toolkit.beep();
			try {Thread.sleep(500);} catch(Exception e) {}
		}
	}

}
