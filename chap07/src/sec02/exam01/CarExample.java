package sec02.exam01;

public class CarExample {

	public static void main(String[] args) {
		
		Truck turck = new Truck("��","����",3,"��"); // Ʈ�� ������ �Ű�����4��
		
		Car car = turck; // �ڵ� Ÿ�Ժ�ȯ
		// turck �� car Ŭ������ ���� 
		
		
		car.speedUp(30); // �θ� �޼ҵ� ȣ��
		//car.maxSpeed(50) 
		// Ÿ���� ��ȯ �Ǿ��� ������ �ڽ� �޼ҵ� ȣ�� �Ұ���
		car.start();
		// �ڽ��� �޼ҵ� ������ �������̵� �߱� ������ ȣ�� ����
		car.stop();
		
	}

}
