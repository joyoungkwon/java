package sec01.exam02;

public class Student extends People{
	public int studentNo;
	// Ŭ������ �� �ٸ� �޼ҵ带 ȣ�� �Ҷ� ��� ���� Ȯ�� ��
	// �θ� ���� �ö󰡼�, �ڽ����� �������� ��������
	// �θ�κ��� �ö󰡴� �߿� �������� ��ó������ ã�� default �� ã�µ�
	// ���Ƿ� �����س��� �����ڰ� ������ default�� �ǰ� �ƴϸ� �ȉ�
	//
	public Student(String name, String ssn, int studentNo) {
		super(name,ssn); // ��� ���� �θ� ������ ȣ�� super(���� ������ ����,Ÿ�� ���߱�)
		this.studentNo = studentNo;
	}
	

}
