package sec03;

public class PhoneExmaple {

	public static void main(String[] args) {
		
		//Phone phone = new Phone("ȫ�浿"); // �߻� Ŭ������ ��� ���� �ڽİ�ü �� ȣ���ؾ� ��
		// �߻� Ŭ������ ���� ��ü ������ �Ұ�.
		
//		SmartPhone ssmartPhone = new SmartPhone("ȫ�浿", 500);
		
		SmartPhone smartphone = new SmartPhone("ȫ�浿", 10000); //�����
		
		
		//���� ���� ����Ʈ������ �⺻������ ���� ���� ������ ���� (String owners,int cost ��)
		
		smartphone.turnOn(); // �߻� Ŭ���� �޼ҵ�
		smartphone.turnOn(); // �߻� Ŭ���� �޼ҵ�
		
		System.out.println(smartphone.cost); // ��ü �޼ҵ�
		
	}

}
