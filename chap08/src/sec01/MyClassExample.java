package sec01;

public class MyClassExample {

	public static void main(String[] args) {
		MyClass my1 = new MyClass();
		
		my1.rc.tunOn();
		my1.rc.setVolume(7);
		
		MyClass  my2 = new MyClass(new Television());
		// �Ű����� 1�� ������ ȣ��
		my2.rc.tunOn();
		my2.rc.setVolume(7);
		
		
		MyClass  my3 = new MyClass(new Audio());
		// �Ű����� 1�� ������ ȣ��
		my3.rc.tunOn();
		my3.rc.setVolume(7);
		
		MyClass my4 = new MyClass();
		my4.methodA();
		// �Ű� ������ ���� �޼ҵ� ȣ��
		
		MyClass my5 = new MyClass();
		my5.methodB(new Television());
		// �Ķ���� ���� �ִ� �޼ҵ带 ȣ��.
	}

}
