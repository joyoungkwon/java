package sec01.exam01;

public interface Car {
	// �������̽��� ��� �ʵ�� �߻�޼ҵ� �� ��밡��

	int MIN_SPEED = 0;
	int MAX_SPEED = 200;
	//�߻� �޼ҵ�
	// ��� �ʵ�� public static final �� �ڵ����� ����.
	
	
	void speedUp(int speed);
	void speedDown(int speed);
	// �߻� �޼ҵ� public abstract �� �ڵ����� ����.
	// �̰� �����ϴ� Ŭ���������� �߻� �޼ҵ� �� �ݵ�� �����ؾ���.
	//������� ���ǵ� 
	
	
}
