package sec02.exam04;

public class AirconCtrl extends TvRemoctrl{
	String modelName= "������������"; // ���̸�

	
	
	
	@Override
	int chanleUp(int x) {
		int result =+ x;
		System.out.println("����� �µ��� 1�ø��ϴ�.");
		return result;
	}

	@Override
	void On() {
		System.out.println("�������� �������մϴ�.");
	}

	@Override
	void Off() {
		System.out.println("�������� ������ ���ϴ�.");
	}
	
	
	
}
