package sec01;

public interface RemoteControl {
	//��� �ʵ� �߻�޼ҵ�
	//public int s =3; // �������̽� �ʵ� �ùٸ� ��� ����� �ƴ�
	// �������̽� �ʵ�� ��� �ʵ常 ��� ���� �ϹǷ�
	// �ʵ� �̸��� �빮�ڷ� ���°��� ������
	public int s =3;
	public int MAX_VOLUME=10;
	public int MIN_VOLUME=0;
	
	// �����س��� ������ ���¿뵵 , (����)
	
	
	
	//public String NAME;
	//��� �ʵ�� �ݵ�� �ʱⰪ�� �־�� ��.
	public String NAME = "ȫ�浿";
	
	void tunOn();
	void tunOff();
	public void setVolume(int volume);
	// �������̽� �޼ҵ�� �߻� �޼ҵ�� ������
	
}
