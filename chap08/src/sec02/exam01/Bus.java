package sec02.exam01;

public class Bus implements Vehicle {

	
	// Vehicle �� �������̽�  �߻�޼ҵ� ����.(implements)
	@Override
	public void run() {
		System.out.println("������ �޸��ϴ�.");
		
	}
	//bus�� Override �������� �޼���.
	public void stop() {
		System.out.println("������ ����ϴ�.");
	}
	

}
