package sec02;

public class Child extends Parent{

	@Override
	public void method2() {
		System.out.println("Child-method()2");
		// ��� ���� Parent �� �޼ҵ� �� ��� ���� 
		//Parent 2���� Child 2�� �ٲ�.
	}
	public void method3() {
		System.out.println("Child-method()3");
	}

}
