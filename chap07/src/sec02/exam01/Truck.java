package sec02.exam01;

public class Truck extends Car{
	int weight ; // ����뷮
	String trunkSize; // Ʈ��ũ ������ // �� �� ��
	int maxspeed ; // Ʈ���� �޸��� �ִ� �ִ� �ӵ� 
	
	// ��� ���� Ŭ���� ���� ������ ȣ�� �ؾ�
	// ������ �ȉ�
	// �Ű����� 4�� (�θ� 2��, �ڽ� 2��)
	public Truck(String color, String company, int weight, String trunkSize) {
		super(color, company);
		this.weight = weight;
		this.trunkSize = trunkSize;
	}
	// ���� �� ���� void Ÿ�� �޼ҵ�
	// �Ű����� 1��.
	// ������� maxSpeed �� �Է��� �Ű����� maxSpeed ��ŭ +�ؼ� ����
	
	void maxSpeed(int maxSpeed) {
		this.maxspeed += maxspeed;
	}
	// car �޼ҵ� start stop �������̵�
	@Override
	void start() {
		//super.start(); // (Car�� �޼ҵ带 ȣ�� )
		// super.start(); �� ���� ����ϸ� Car �޼ҵ���
		// �Է°��� ���̳���.
		System.out.println("Ʈ���� ��� �߽��ϴ�.");
	}

	@Override
	void stop() {
		System.out.println("Ʈ���� ������ϴ�.");
	}
	
	
	
	
}
