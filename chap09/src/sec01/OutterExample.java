package sec01;

public class OutterExample {

	public static void main(String[] args) {
		
		Outter outter = new Outter();
		Outter.Nested nested = outter.new Nested(); // �Ϲ� �ν��Ͻ� ȣ��.
		nested.print();
		// static �϶�, Outter.Nested nested = new Outter.Nested();
		// �ν��Ͻ� A.B b = aa.new B();
		// static �϶� A.B b = new.A.B
		// ��ø Ŭ���� , ���� Ŭ����  , ���� Ŭ����
		// ��ø Ŭ���� Ŭ���� �ȿ� �ϳ��� ���ִ°�
		// ���� Ŭ���� Static �� ����Ŭ���� 
	}

}
