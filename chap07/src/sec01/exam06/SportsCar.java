package sec01.exam06;

public class SportsCar extends Car { // Car ���

	@Override // �������̵�
	public void speedUp() {
		speed += 10; // ������ �ִ� �޼ҵ��� speed +=1 �� 10���� �������̵�
	}
//	@Override
//	public void stop() { //final �޼ҵ�� �޼ҵ� �������̵��� �ȵ�
//		System.out.println("���� ����"); //- Cannot override the final method 
//		speed = 0;
//	}

	public void stop(int x) {
		System.out.println("������ī �� ����");
		speed = 0;
		// �޼ҵ� �̸��� ���Ƶ� �Ѱ��ִ� ���̳� �Ű������� �ٸ��� �ٸ� �޼ҵ�� �ν�
	}
}
