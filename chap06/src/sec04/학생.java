package sec04;

public class �л� {
	// ���� , �а� �ڵ� , ���輺��, ��� ���� ����
	// ������ ����
	// ������ �ŰԺ��� ���� �а��ڵ�, ���� ����
	// ��ŸƮ �޼ҵ�� ���ϰ� ���� void ��
	// end �޼ҵ� �� ���� ����
	// ���� �������� ���� ���� 90�̻� A 80�� B 70 C ������ F

	// 1�� �ּ� ���� �а� �ڵ� ���輺�� // ��� ���� ����
	String gender;
	String code;
	int score;

	// �޼ҵ�� ������ �򰥸����ʱ�
	// 2�� �ּ� ���� ������ ����
	// ������ ���� �⺻ ������ ���� ���� �ػ��·� ȣ��
	public �л�(String gender, String code, int score) {
		super();
		this.gender = gender; // Ŭ�������� ���� ���Խ��� �޾ƿ�.
		this.code = code; // Ŭ�������� ���� ���Խ��� �޾ƿ�.
		this.score = score; // Ŭ�������� ���� ���Խ��� �޾ƿ�.
	}

	// 7�� �ּ� ���� , ���ϰ� ���� void start �޼ҵ� �����
	void Start() {
		System.out.println(code); // �Է��� �а� �� �ҷ��ͼ� ��½�Ŵ
		System.out.println(gender); // �Է��� ������ �ҷ��ͼ� ��½�Ŵ
		System.out.println(score); // �Է��� ������ �ҷ��� ��½�Ŵ
		String result = end(score); // String ���� ���� if���� String
		//Ÿ�� result�� �ް� end if�� (score)�� ����
		System.out.println("������" + result);
		// (������,result)��� ��� ���� ����
	}
	// 8 �� �ּ� ���� end ������ ����� ���ϰ����� ����
	// ���� ���� A = 90 B = 80 C= 70�� IF �� ���
	// result �� "A,B,C"��� �� ���� (��� ���� �� ���� ����ٰ�)

	String end(int score) { // ���ڸ� ���ڿ� A , B ,C �� ���ϱ� ����
		// �޼ҵ� �� String Ÿ�� end ���� ���ϰ��� �ʿ��Ͽ� void �޼ҵ� 
		// ��� ���ϰ� ���� Ÿ�� String ���� �޾ƿ�
		String result; // ��Ʈ������ result;�� �ʱ�ȭ ��Ű��.
		if (score >= 90) { // score �� ���� 90�� ��
			result = "A";
		} else if (score <= 80) {// score �� ���� 80�� ��
			result = "B";
		} else if (score <= 70) {// score �� ���� 70�� ��
			result = "C";
		} else {// score �� ���� 69~0������ ��
			result = "D";
		}
		return result; // ��� ���� result ������ ����

	}

}
