package sec02;

public class KumhoTire extends Tire{

	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}

	
	
	public boolean roll() {
		++accmulatedRotationg; // ���� ȸ���� 1����
		if (accmulatedRotationg < maxRotation) { // ����ȸ������ �ִ� ȸ���� ���� ������
			System.out.println(location + "��ȣTire ���� :" + (maxRotation - accmulatedRotationg) + "ȸ");
			return true; // �ִ�ȸ�������� ����Ƚ����ŭ ���� �ϰ� ȸ ���(Ÿ�̾� ����)

		} else { // ���� ȸ������ �ִ� ȸ���� ���� Ŭ�� Ÿ�̾� Tire ��ũ ���
			System.out.println("***" + location + "��ȣTire ��ũ***");
			return false;
		}
	}
}
