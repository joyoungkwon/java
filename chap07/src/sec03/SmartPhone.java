package sec03;

public class SmartPhone extends Phone {
	
	// Phone ���� ���� Smart phone �ŰԺ���
	int cost;// ����
	
	//������
	
	public SmartPhone(String owenr, int cost) {
		super(owenr); // Phone Ŭ�������� default ������ ���� ���� ������ ���� . �θ� �ҷ��;���.
		this.cost= cost;
	}
	
	
	
//	SmartPhone ���� �޼ҵ�
	public void internetSearch() {
		System.out.println("���ͳ� �˻��� �մϴ�.");
	}

	
	
}
