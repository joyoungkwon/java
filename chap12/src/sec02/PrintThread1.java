package sec02;

public class PrintThread1 extends Thread {
	private boolean stop; // boolean Ÿ�� ��ž �⺻������ false;
	
	public void setStop(boolean stop) {
		this.stop = stop;  // �޾ƿ��°�
	}

	@Override
	public void run() { // run �޼ҵ� �������̵�
		while(!stop) {
			System.out.println("��"); // 1�ʵ��� ����Ǵ� �������̵�
		}
		System.out.println("�ڿ�����"); // 1�ʵǸ� �ڵ�����
		System.out.println("��������"); // ��������
	}

}
