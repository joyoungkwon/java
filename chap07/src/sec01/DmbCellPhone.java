package sec01;
 // extends - ��� ,+ Ŭ���� �̸�
 // �ڽ� ���� �θ��� ����� ���������� ���� ���
public class DmbCellPhone extends CellPhone {
	int channel;

	// ��ü ������ model color channel �Է�
	DmbCellPhone(String model, String color, int channel) {
		this.channel = channel;
		this.color = color; // ��ӹ��� �ʵ�
		this.model = model; // ��� ���� �ʵ�
	}

	void turnOnDmb() {
		System.out.println("ä��" + channel + "�� DMB ��� ������ �����մϴ�.");
	}

	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("ä��" + channel + "������ �ٲߴϴ�.");
	}

	void turnOffDmb() {
		System.out.println("��ۼ����� ����ϴ�.");
	}
}
