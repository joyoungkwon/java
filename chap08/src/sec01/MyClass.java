package sec01;

public class MyClass {
	// �ʵ�
	RemoteControl rc = new Television();
	
	// ����Ʈ ������
	// ����Ʈ ������ ȣ��� Television ������ �޼ҵ� ȣ��
	MyClass(){
		
	}
	// ���� ���̽��� �Ű� ������ �ϴ� ������. ( �������̽��� �־�� ���� ���� )
	// Television ȣ��
	// �Ű� ���� ��ü�� �޼ҵ� ȣ��.
	MyClass(RemoteControl rc){
		this.rc = rc;
		rc.tunOff(); // Television ������ tunOff ȣ��
		rc.tunOn();// Television ������ tunOnȣ��
		rc.setVolume(5); // Television ������ setVolume ȣ��
	}
	// Audio ��ü�� �޼ҵ� ȣ��
	void methodA() {
		RemoteControl rc = new Audio();
		rc.tunOn();
		rc.setVolume(5);
		rc.tunOff();
	}
	//�Ű� ���� ��ü�� �޼ҵ� ȣ��
	void methodB(RemoteControl rc) {
		rc.tunOn();
		rc.setVolume(5);
		
	}
	
}
