package sec02;

public class ChildExample {

	public static void main(String[] args) {
		
		
		Child child = new Child();
		
		Parent parent =child; // ���� ��ü�� ���� ��ü ���
		
		parent.method1(); // child �� �޼ҵ�� ȣ�� �� �Ұ�
		parent.method2(); // parnet �� ����� child Ŭ�������� �������̵� �� �޼ҵ�� ȣ�� ����
		//parent.method3();// ȣ���� �Ұ�
		// ȣ���� �Ұ��� ������ Child Ŭ������ ���ο� ��ü new child �� Parent Ŭ������ ������ �ִ�
		// parent �� ���ο� ��ü�� ��� �Ǿ� ������ child �� ������ �ִ� method3 �� ȣ�� �Ұ�
		

	}

}
