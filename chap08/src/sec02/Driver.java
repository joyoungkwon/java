package sec02;

public class Driver {
	
	public void Driver(Vehicle vehicle) {
		vehicle.run();
//		vehicle.stop(); 
		// Driver �������� Vehicle �� �Ķ���ͷ� �޴� ������ ����
		// vehicle.run() ���� vehicle �޼��� ȣ��
	}
	

	public static void main(String[] args) {
		Driver driver = new Driver();
		// Driver ��ü ����
		Bus bus = new Bus();
		// ������ ��ü ����
		Taxi taxi = new Taxi();
		// �ý��� ��ü ����
		
		
		
		driver.Driver(bus);
		//bus ��ü�� �Ű� ������ �Ѱ���.
		// bus �� Vehicle �������̽��� ���� ��ü �̹Ƿ�
		// Vehicle Ÿ������ �ڵ���ȯ �Ǿ� ��
		
//		driver.stop(); Vehicle bus �� 
		// vehicle Ÿ������ �ڵ���ȯ �Ǿ� , Override�� run �޼���� ��� ���� ������.
		// Override �������� bus���� stop�̶�� �޼���� ��� �Ұ���. - (7)line

	}

}
