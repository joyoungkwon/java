package sec01;

public class Computer {
	String comppany;// ���� ȸ��
	int sell;// ����
	String production;// ����⵵

	void powerOn() {
		System.out.println("������ �մϴ�."); // ������ �մϴ�
	}

	void powerOff() {
		System.out.println("������ ���ϴ�");// ������ ���ϴ�
	}

	void web() {
		System.out.println("���ͳݿ� �����մϴ�");// ���ͳ� �����մϴ�
	}
	void webx() {
		System.out.println("���ͳ� ���ῡ ���� �մϴ�"); // ���ͳ� ������ �����մϴ�
	}

	String playGame(String game) {
		String result = game + "�� ������ �մϴ�";
		return result; // ������ �մϴ�
	}
	String offGame(String game) {
		String result = game + "���α׷��� ���� �մϴ�";
		return  result; // ������ �����մϴ�.
	}
}
