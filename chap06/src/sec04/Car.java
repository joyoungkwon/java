package sec04;

public class Car {
	// Car Ŭ���� ����
	// ��� ���� ���ǵ� ���� �⺻ ���ǵ� 100
	private int speed = 100; // �⺻ ���ǵ�
	
	
	
	// �޼ҵ� ����
	// �õ��ɱ� powerOn �õ����� powerOff ���ϰ� ���� void
	// �ӵ� ���� speedUp ���� speedDown   - 10�� ���� ,10�� ����  ���ϰ� int
	// ���� breakZero 0 �϶� "�õ��� ������ϴ� ���"
	void powerOn() { // �õ� �ɱ�
		System.out.println("�õ��� �������ϴ�.");
	}
	void powerOff() { // �õ� ����
		System.out.println("�õ��� �������ϴ�.");
	}
	// �ӵ� ���� �޼ҵ�
	int speedUp(int x) {  // x ��ŭ
		speed += x; // ���ǵ� �⺻�� 100���� +
		return speed; // �װ� ���ǵ� �Ű� ������
		// �����Ѵ�.
	}
	// �ӵ� ���� �޼ҵ�
	int speedDown(int x) { //x��ŭ
		speed -= x; // �⺻ ���ǵ尪���� x��ŭ
		return speed; // ���� ���ǵ忡 �����Ѵ�.
	}
	int breakZero(int x) { // x�� ���� �޾Ƶ�
		speed = 0; // �극��ũ ���ζ� �̸��� �����
		return speed; // ���ǵ带 0���� �����ع�����
		// �װ� ���ǵ忡 0�̶�� �����Ѵ�.
	}
}
