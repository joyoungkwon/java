package sec02;

public class Remote  {
	RemoteControl rc = new RemoteControl() { // ��ȣ ���� ; �������ʰ� �߰�ȣ ������ �κп� ; ���� ���� ������.
		//RemoteControl �� rc�� ��ü ������ �͸�ü�� �������̵�
		
		
		public void berakTV() {
			System.out.println("�׷��� ���� �ȵ� ������ ¥���� ��¥��.");
		}// ���� �޼ҵ带 �������̵� �޼ҵ� �ȿ� ȣ�� �ϸ�
		
		
		
		@Override
		public void turnOn() {
			System.out.println("Ƽ�� �մϴ�."); // interface �� �߻� �޼ҵ� turnOn�� �����ϴ� �޼ҵ�
			berakTV(); // ���� �޼ҵ� ȣ��
			
		}
		
		@Override
		public void turOff() {
			System.out.println("Ƽ�� ���ϴ�."); // interface �� �߻�޼ҵ� turnOff�� �����ϴ� �޼ҵ�
			
		}
	};
		// �޼ҵ� ���� ���� ������ �͸� ���� ��ü ���
	void method1() {
		RemoteControl locVar = new RemoteControl() {

			@Override
			public void turnOn() {
				System.out.println("������� �մϴ�");
				
			}

			@Override
			public void turOff() {
				System.out.println("������� �մϴ�");
				
			}
			
		};
		// �͸� ���� ��ü ���� �޼ҵ��
		// �ܺ� �޼ҵ忡�� �ݵ�� ȣ���� �ʿ���.
		locVar.turnOn();
		locVar.turOff(); // ���� �޼ҵ� ���� ��Ų�� �͸�ü �� ���� �޼ҵ� 1�̶�� ū Ʋ���� ȣ���� ����� 
		// ������� ����.
	}
	// �Ķ���ͷ� �͸�����ü�� ����ϴ� �޼ҵ�
	void method2(RemoteControl rc) {
		rc.turnOn();
		rc.turOff();
	}

}
