package sec02;

public class RemoteMain {

	public static void main(String[] args) {
		
		Remote rm = new Remote(); // Remote ��ü ����
		
		rm.rc.turnOn(); // rm ��ü ���� ������, �׾ȿ� �ִ� rc �͸� ��ü�� ���� �������̵� ȣ��
		rm.method1(); // �͸� ��ü �ʵ� ���
		rm.method2(	// �͸� ��ü �޼ҵ� ���� ���� ���� ���
				new RemoteControl() {
					
					@Override
					public void turnOn() {
						System.out.println("����ƮƼ�� �մϴ�.");
						
					}
					
					@Override
					public void turOff() {
						System.out.println("����Ʈ Ƽ�� ���ϴ�.");
						
					}
				}
		);
		
	}

}
