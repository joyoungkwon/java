package sec01.exam07.pack1;

public class B {
	
	public void method() {
		// protected �� ���� ��Ű�������� ������ ����.
		A a = new A(); 
		// A �� ���ο� ��ü ����
		a.fled = "value";
		// protected String �ʵ忡 ���� ����
		a.method();
		// protected A�޼ҵ� ȣ��
	}

}
