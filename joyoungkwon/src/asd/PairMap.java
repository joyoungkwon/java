package asd;

abstract class PairMap {
	String KeyArray[]; // key ���� �����ϴ� �迭
	String valueArray[]; // value ���� �����ϴ� �迭

	abstract String get(String key); // key ���� ���� value ����, ������ null ����

	abstract void put(String ket, String value);

	// key�� value�� ������ ����. ������ key�� ������, ���� value�� ����
	abstract String delete(String key);

	// key ���� ���� ������ (value�� �Բ�) ����, ������ value �� ����
	abstract int length(); // ���� ����� �������� ���� ����
}
