package sec02.exam03;

public class SnowTire extends Tire {
	String modelName; // �� �̸�
	int cost; // ���ݤ�
	String Design ="����� Ÿ�̾�!"; // Ÿ�̾� ������
	@Override
	public void run()  {
		System.out.println("�� ���� ���� ���� , ����� Ÿ�̾ �뱼�뱼 �������ϴ�!");
	}
	 void stop() {
		 System.out.println("������ ���� ������ �����Ÿ�̾� �� ���� �����ϴ�!");
	 }
	
	
	
}
