package sec01;

public class StudentExample {

	public static void main(String[] args) {

		Student stu = new Student(1123, "��", 173);

		stu.study("�б�"); // �ڱ�
		String eat = stu.eat("��"); // �θ�
		System.out.println(eat);
		// String Ÿ���� return���� �ִ� �޼ҵ��,
		// �޴� Ÿ���� ���� ������ ���� �ϰ� result �� ���� ��Ű��
		// ���� ������ ���
		stu.sleep(); // �θ�
		// void return ���� ����
		String run = stu.run(4);
		System.out.println(run);
		// String Ÿ���� return���� �ִ� �޼ҵ��,
		// �޴� Ÿ���� ���� ������ ���� �ϰ� result �� ���� ��Ű��
		// ���� ������ ���
	}

}
