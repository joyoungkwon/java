package sec02;

public class PrintThread2 extends Thread {
	

//	public void run() { // run �޼ҵ� �������̵� start()�� ȣ��
//		try {
//			while(true) {
//				System.out.println("������");
//				Thread.sleep(1);
//			}
//		} catch (InterruptedException e) { // pThread2.interrupt
//			//��� ���� �������� ȣ��� ���ܸ� �߻����Ѽ� ���� ��Ŵ
//			// while �̶�� �ݺ����� Ƚ���� ���������ʰ�, ���ᰪ�� false�� ������
//			// ���ܷ� �����Ŵ.
//			System.out.println(e.getMessage());
//			// ���ܺ��� e�� get�޼ҵ�� �޼��� �޾ƿ���.
//		}
//		System.out.println("�ڿ�����");
//		System.out.println("��������");
//}
	@Override
	public void run() { // run �޼ҵ� �������̵� start()�� ȣ��
		while(true) {
			System.out.println("������");
			if(Thread.interrupted()) { // 
				// interrupt ȣ�⿩��
				break;
			}
		}
		System.out.println("�ڿ�����");
		System.out.println("��������");
	}
}