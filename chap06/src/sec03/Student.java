package sec03;

public class Student {
	// ��� ���� �̸� ���� �й� ���� ����ó
	// �⺻������
	// ����� ���� ������2��
	// ����� 1�� ��: �̸� ����
	// ����� 2�� ��: �̸� �й� ����ó

	String name; // �̸�
	int age; // ����
	String numb; // �й�
	String gender;// ����
	String phone; // ����ó
	// ���ں����� ���� �۾��� �ʿ����� �ʴٰ� �Ǵ� �ϸ� String �� �ַ� �����
	
	
	
	public Student() { // �⺻������

	}

	public Student(String name, int age) { // ����� ����1 ������ 1����: �̸� , ����
		this.name = name; // �̸� �Ű� ��������
		this.age = age; // ����
	}

	public Student(String name, String numb, String phone) { // ����� ���� 2 : ������ �̸� �й� ����ó
		this.name = name; // �̸�
		this.numb = numb; // �й�
		this.phone = phone; // ����ó
		
		// ���� �����ڿ� �ٸ� ������ �߰��� �����ε��̶���
		// �ҽ����� using Filed �����ϰԸ���
	}

	}
