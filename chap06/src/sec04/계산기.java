package sec04;

public class ���� {
	void powerOn() { // ���ϰ� ���� ���̵� �޼ҵ�
		System.out.println("�������մϴ�");
	}

	void powerOff() {
		System.out.println("���������ϴ�");
	}

	int plus(int x, int y) { // ���� �ʿ��� �޼ҵ� ����)
		int result = x + y;
		return result;
	}

	// ��ü ������ ȣ�� ������ ���������� ū���� ����, ����� ������ �ϱ�
	// if�� ��밡��
	int minus(int x, int y) {
		int result;
		if (y > x) {
			result = y - x;
		} else {
			result = x - y;
		}
		return result;
	}
	// ���ϱ� 0�� ����� ���ص� 0 �̳���
	// 0�� �Է� ������ "0�� �Է� �Ҽ� �����ϴ�" ��� 
	
	String mul(int x, int y) { // �ൿ�ϴ� �޼ҵ� �� x ,y �� ���� ��������
		if( x==0 || y==0) {	// x�� y�� 0�̸�
			String message = "0 ���Է��Ҽ� �����ϴ�."; // 0�� �Է� �Ҽ� �����ϴ� �� ���ڿ��� String message�� ����
			return message; // �޼����� ������ ���� ����
		}else { // x��y�� 0�� �ƴҋ�
			int result = x * y;  // int result �� x y�� ���Ѱ��� ����
			return  String.valueOf(result); // int �� ���� ���ϰ��� ���ڿ��� ���� ����ȯ ���� result�� ����.
		}
		
	}
	double divide (int x , int y) {
		double result = (double)x / (double) y;
		return result;
	}
}
