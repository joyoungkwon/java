package sec02;

public class Bus implements Vehicle {

	
	// Vehicle �� �������̽�  �߻�޼ҵ� ����.(implements)
	@Override
	public void run() {
		System.out.println("������ �޸��ϴ�.");
		
	}
	//bus�� Override �������� �޼���.
	void stop() {
		System.out.println("������ ����ϴ�.");
	}
	

}
