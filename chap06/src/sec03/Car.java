package sec03;

public class Car {
	String company;
	String model ;
	String color ;
	int maxSpeaed;
	int speed;
	

	public Car() { // �⺻ ������.

	}

	public Car(String model, int speed, String color) {  
		// ó���� ������ ���� Ÿ�� ��� �����ؼ� ����;���
		// EX ) ���ڸ� ("��,��,��" �ι�°�� �������·� �����ϸ� int )
		// �𵨸�� �ӵ��� ���� ������ ����
		// �����ڰ� �ϳ� �����Ƿ� ��ǻ�Ͱ� �ڵ����� �������� ����
		this.model = model;
		this.speed = speed;
		this.color = color;
	}
	public Car(String mode2, int speed ) {
		this.model=model;
		this.speed=speed;
		// this �ʱ�ȭ ���� ��.
		// ���� ���� �Ȱ��� ����ȭ ������ �ް����� ������ this ����
		// ������ ���� �����°�.
	}
}
