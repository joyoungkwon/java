package sec02;

public class HankookTire extends Tire{

	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	@Override
	public boolean roll() {
		++accmulatedRotationg; // ���� ȸ���� 1����
		if (accmulatedRotationg < maxRotation) { // ����ȸ������ �ִ� ȸ���� ���� ������
			System.out.println(location + "�ѱ�Tire ���� :" + (maxRotation - accmulatedRotationg) + "ȸ");
			return true; // �ִ�ȸ�������� ����Ƚ����ŭ ���� �ϰ� ȸ ���(Ÿ�̾� ����)

		} else { // ���� ȸ������ �ִ� ȸ���� ���� Ŭ�� Ÿ�̾� Tire ��ũ ���
			System.out.println("***" + location + "�ѱ�Tire ��ũ***");
			return false;
		}
	}
		
	
	
		
	

}
