package sec02.exam05;

public class PhoneExample {

	public static void main(String[] args) {
		SmartPhone st = new SmartPhone();           // ����Ʈ���� ��ü ����� 
//		Phone stp = new SmartPhone();             // �ڽ� ��ü�� �θ� ��ü�� Ÿ�Ժ�ȯ.(�ڵ���ȯ  �θ� �� ũ�� ������)
		Phone p = new SmartPhone();       
		
		System.out.println(p.cost); // Ÿ�Ժ�ȯ ������ �θ� �ʵ尪 ȣ��.
		p.powerOn(); // �θ��� �޼ҵ� ȣ��
		p.ring(); // ���ٶ��̵� �� �ڽ� �޼ҵ� ȣ��
		//		p.videoOn - �� �ڽ��� �޼ҵ��, ��� ���� �θ� ��ü�� Ÿ�� ��ȯ �߰�, �������̵� ���� �ʾ����Ƿ� ȣ�� �Ұ���.
		//		p.phoneCase ="�ϵ����̽�" �� �ڽ��� �ʵ尪�̸� �� ó�� �޼ҵ� ȣ��� ���� Ÿ�� ��ȯ�� �Ǹ� �ʵ尪 ȣ���� �Ұ�����.
		
		SmartPhone sp =(SmartPhone)p;  // double t = int x/y;
		// �θ� ��ü�� �ڽ� ��ü�� ���� Ÿ�� ��ȯ ��Ŵ 
		// ���� Ÿ�� ��ȯ �� �Ҽ� �ִ� ������ ��ü ������� �ڵ� Ÿ�Ժ�ȯ�� �ѹ��̶� �ؾ� �� ��.
		sp.phoneCase="�ϵ��ϵ�!���̽�"; // �ڽ� ��ü �ʵ峪 �޼ҵ带 ��� ������
		sp.powerOn(); // �θ� ��ü �޼ҵ� ��� ����
		System.out.println(sp.cost); // ���� �̸��� �ʵ�� �ڽ� ��ü ��� 
		// ��ü ���� instanceȭ
		// instanceof -instanceȭ �������� ���� ������
	}

}
