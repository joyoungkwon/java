package sec02.exam01;

public class Car {
	// �������
	String color ; // ����
	String company;//����ȸ��
	int speed ; // �ڵ��� �ӵ�
	int cost ; // ����
	
	
	//������, �ȸ���� default(�⺻) ������, ����� �⺻ ������ x
	
	public Car(String color, String company) {
		this.color = color;
		this.company = company;
	}
	// �Ű� ���� 1�� �޼ҵ� ����Ÿ�� x (void)
	// �ʵ尪�� �ִ� speed�� �Ű����� speed ����ŭ ������Ų��
	void speedUp(int speed) {
		this.speed += speed; // this= ������� �� speed �ΰ� ǥ�� 
		System.out.println(speed);
	}
	//  �Ű� ���� 1�� �޼ҵ� ����Ÿ�� (void) ����
	//  �ʵ尪�� �ִ� speed �� �Ű����� speed ��ŭ ���� ��Ų��.
	void speedDown(int speed) {
		this.speed -= speed;
	}
	// �Ű����� ���� return���� ���� void �޼ҵ� 
	// ����� �õ��� �ɾ����ϴ� ���
	//-�������̵� �Ұ�
	void start() {
		System.out.println("�õ��� �ɾ����ϴ�.");
	}
	// �Ű����� ���� return���� ���� void �޼ҵ� 
	// ����� �õ��� ������ϴ� ���
	//-�������̵� �Ұ�
	void stop() {
		System.out.println("�õ��� ������ϴ�.");
	}
	
}
