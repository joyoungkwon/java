package sec01;

public class MyPoint {
	int a;
	int b;

	public MyPoint(int a, int b) {
		this.a = a;
		this.b = b;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof MyPoint) { // �ν��Ͻ� ���� , ��ü�� ������ ��
			MyPoint mypoint = (MyPoint) obj; // ������Ʈ ȣ��(?)
			if (obj.equals(mypoint.a)) { // ������Ʈ �� ���� ������ �ִ� my point a �� ��
				return true; // ������ �� �� return;
			}
		}
		return false; // Ʋ���� ���� �� return;
	}

	@Override
	public String toString() { // system.out.plintln �� ���� to String �� �޼ҵ带 ȣ�� �ϴ°�.
		//(object) �ȿ� �ִ� �������� ������, 
		// ���ϰ��� �ϴ� ���� object �ȿ� �ִ� ���� ���� ������ ���ϴ� ���� ���.
		// �װŸ� ���� to String ������ �޼ҵ带 �������̵� �ؼ� ���ϴ°����� ���
		return "Point(" + a + ", " + b + ")";
		//to String �����ڿ��� �Ķ���� ���� �Ѱ��� ���� to String ���� 
		// return ��Ű�� ���� ������ �����ϴ� ������ ��
	}

}
