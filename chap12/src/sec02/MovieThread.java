package sec02;

public class MovieThread  extends Thread{

	@Override
	public void run() {
		while (true) {
			System.out.println("�������� ����մϴ�.");
			if(interrupted()) {
				System.out.println("������ ����� ������ �߻��߽��ϴ�.");
				break;
			}
		}
		System.out.println("������ ������");
		System.out.println("������ ����");
	}
	
}
