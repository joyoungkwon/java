package sec02;

public class ImplementationC  implements InterfaceC{ // �������̽� a b�� ��� ���� �������̽� c�� �����ϴ� Ŭ���� 

	@Override
	public void methodB() {
		System.out.println("�޼ҵ� b����");
	}

	@Override
	public void methodA() {
		System.out.println("�޼ҵ� a����");
		
	}

	@Override
	public void methodC() {
		System.out.println("�޼ҵ� c����");
		
	}
	
	public static void main(String[]args) {
		ImplementationC imple = new ImplementationC(); // �������̽� a,b�� extends�� c�� �������̽� cŬ�������� ������ cŬ���� ��ü ����
		// �������̽� c ��ü�� ic �� a �� b �� ��� �޼ҵ带 ��밡����
		
		InterfaceC ic = imple;
		ic.methodA();
		ic.methodB();
		ic.methodC();
	}

}
