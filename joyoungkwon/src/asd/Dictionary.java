package asd;

class Dictionary extends PairMap {
	private int set; //�����ͻ����� �߰��� �迭��ȣ�� ������Ű���� �ʵ�
	int k =0;

	public Dictionary(int num) { //������.�Ķ���� int num
		KeyArray = new String[num];
		valueArray = new String[num];
		this.set = 0; // 
	}
	// �̸����� ������ �˻��ϴ� �޼ҵ�
	public String get(String key) { 
		for (int i = 0; i < KeyArray.length; i++) {
			if (key.equals(KeyArray[i])) {
				return valueArray[i];
			}
		}
		return null; // ���ϴ� key�� ���ٸ� null ����
	}
 //Ű(�̸�)�� �� (����) �̿��Ͽ� �迭�� �߰�
	//�� ,Ű���ߺ��Ǹ� ������ ����.
	public void put(String key, String value) { //��浿 c set 2
		for (int i = 0; i < KeyArray.length; i++) {
			if (key.equals(KeyArray[i])) {
				KeyArray[i] = key;
				valueArray[i] = value;
				return; // �ߺ��� key�� �ִٸ� �����ϰ� �Լ� ����
			}
		}
		KeyArray[set] = key;
		valueArray[set] = value;
		set++; // �迭 ���ȣ ����. //2
	}

	public String delete(String key) {
		for (int i = 0; i < KeyArray.length; i++) {
			if (key.equals(KeyArray[i])) {
				String s = valueArray[i];
				KeyArray[i] = null;
				valueArray[i] = null;
				k++;
				return s; // ������ value �� ����
			}
		}
		return null; // ������ ���� ���ٸ� null ����
	}

	public int length() {
		return set-k;
	}
}