package sec02.exam04;

public class TvRemoctrl extends Remoctrl {
	String modelName = "Tv������"; // �������� �� �̸�

	int chanleUp(int x) { // ä�� �ø��� �޼ҵ�
		int result = +x;
		System.out.println("Tv�� ������ " + result + "��ŭ ���� �ø��ϴ�.");
		return result;
	}

	// extends �θ� Ŭ���� �޼ҵ� ȣ�� �� ������ Override
	@Override
	void On() {
		System.out.println("Tv�� ������ �մϴ�.");

	}
	// extends �θ� Ŭ���� �޼ҵ� ȣ���� ������ Override
	@Override
	void Off() {
		System.out.println("Tv�� ������ ���ϴ�.");
	}

}
