package sec04;

public class Calculator {
	int plus(int x, int y) {
		int result = x + y;
		return result; // �հ� �޼ҵ�
	}

	double avg(int x, int y) {
		double sum = plus(x, y); // plus �޼ҵ� ����ȣ��
		
		double result = sum / 2; 
		// double result�� plus �� �� /2 �� ����
		return result;// ���� ��� ����
	}

	void execute() {
		double result = avg(7, 10);
		// avg(7,10)�� plus �޼ҵ� ȣ�� �� �۾� �� ��� �� ����
		// �� avg �հ� (sum)/2�۾� �� ����� ����
		println("������ " + result); 
		// �޼ҵ� �ȿ� execute �ȿ� �ҷ����� ����Ʈ �� ȣ�� �ϱ� 
		// ����.
		
		
	}

	void println(String message) {
		System.out.println(message);
	}

}
