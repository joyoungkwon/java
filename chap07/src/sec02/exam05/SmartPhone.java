package sec02.exam05;

public class SmartPhone extends Phone{
	// Phone Ŭ������ �����ڰ� default ������ �� ������ ���� ����
	
	boolean touch; // boolean Ÿ���� ��ġ
	String camera; // ī�޶�
	String phoneCase; // �����̽�
	String protectedFilm;// �ʸ�
	int cost = 200000;
	
	
	
	// extends ��� ���� �θ��� �޼ҵ带 ������
	// ���� x 
	@Override
	void ring() {
		System.out.println("����Ʈ���� �︳�ϴ� ����");
	}
	// ���� x
	void videoOn() {
		System.out.println("�������� ��� �մϴ�.");
		// ���� x
	}
	void videoOff() {
		System.out.println("������ ����� ����ϴ�.");
	}
	
	
	
}
