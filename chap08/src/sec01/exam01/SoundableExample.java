package sec01.exam01;

public class SoundableExample {

	public static void main(String[] args) {
		Soundable sd = new Cat(); // �������̽� �ڽ� Ŭ���� cat �� ȣ��.

		System.out.println(sd.sound()); // cat �� �޼ҵ� ȣ��.

		sd = new Dog(); // sd�� �������̽� �ڽ�Ŭ���� dog�� ȣ��

		System.out.println(sd.sound()); // dog �޼ҵ�ȣ��
	}
	// ����ʵ�� �߻�޼ҵ常.
	// ����ʵ�� Ÿ���� �빮�� �ʱⰪ ���� �ݵ���ʿ�
	// �߻�޼ҵ�� �߰�ȣ�� �ȵ�
	// �������̽��� �����ؾ��� implements �ʿ�
	// Ŭ�������� ��� ������ �������̵� �ؾ���
	// �������̽� �޼ҵ� 2�� �Ͻ� - ���� �� �ϳ��� ������.
	
}
