package sec02;

public class Tire {
	// ��� �ʵ� ����
	public int maxRotation; // �ִ� ȸ����
	public int accmulatedRotationg; // ���� ȸ����
	public String location; // Ÿ�̾��� ��ġ
	
	// ������
	// �Ű� ���� 2�� ������.
	public Tire( String location,int maxRotation) {
		this.maxRotation = maxRotation;
		this.location = location;
	}
	
	// �޼ҵ� �Ű����� ���� return Ÿ�� boolean
	public boolean roll() {
		++accmulatedRotationg; // ���� ȸ���� 1����
		if (accmulatedRotationg < maxRotation) { // ����ȸ������ �ִ� ȸ���� ���� ������
			System.out.println(location + "Tire ���� :" + (maxRotation - accmulatedRotationg) + "ȸ");
			return true; // �ִ�ȸ�������� ����Ƚ����ŭ ���� �ϰ� ȸ ���(Ÿ�̾� ����)

		} else { // ���� ȸ������ �ִ� ȸ���� ���� Ŭ�� Ÿ�̾� Tire ��ũ ���
			System.out.println("***" + location + "Tire ��ũ***");
			return false;
		}
	}
	
	
}
