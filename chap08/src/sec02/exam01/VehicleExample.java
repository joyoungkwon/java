package sec02.exam01;

public class VehicleExample {

	public static void main(String[] args) {
		
		Vehicle vehicle = new Bus();// �������̽� ������ü bus 
		
		vehicle.run();  // �������̵� �� ���� �޼��� ȣ��
//		vehicle.stop(); �� ȣ�� �ȉ� ������ Override �������� 
		
		Bus bus = (Bus) vehicle; // �������̽� vehicle�� ������ bus�� , vehicle�� ������ȯ 
		bus.stop(); // ������ȯ ���� ȣ�� ����.
	}
	//Vehicle vehicle = new Vehicle();
	// �������̽��� ������ , ��ü�� �ڱ� ������ ������ ����.
	// �������̽��� ���߻���� ������.

}
