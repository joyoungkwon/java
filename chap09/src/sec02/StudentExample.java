package sec02;

public class StudentExample {

	public static void main(String[] args) {
		// Student B ��ü ����.
		StudentA stu = new StudentA();
		StudentA.StudentB stb = stu.new StudentB();
		// ��øŬ���� �ٱ�Ŭ����, ����Ŭ����
		// ���� Ŭ���� ��ü ������ �ٷ� X
		// �ٱ�Ŭ���� ��ü�� ���� ������ �� ����Ŭ���� ��ü�� ������ �� ����
		// �� Ŭ������ static���� ����Ǿ� ������ �ٷ� ���� ������

		stb.age = 17;
		stb.name = "��ö��";
		stb.sleep();

		stu.person.Wake();
		stu.method1();
		// method2 �� �Ű� ������ Person Ŭ���� Ÿ���� �Ѱ������
		// �Ű������� �������� ; ������.
		stu.method2(new Person() {
			void study() {
				System.out.println("���θ��մϴ�.");
			}

			@Override
			void Wake() {
				System.out.println("8�ÿ� �Ͼ�ϴ�.");
				// �������̵� �ȵ� �޼ҵ带 �ٷ� ȣ��ȵǱ� ������
				// �������� �޼ҵ带 ȣ����.
				study();
			}

		}

		);

	}

}
