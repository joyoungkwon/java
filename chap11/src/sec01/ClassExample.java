package sec01;

public class ClassExample {

	public static void main(String[] args) {

		Key key = new Key(50); // ��ü ����
		Class calzz = key.getClass(); // ��ü ���� ������ getClass

		System.out.println(calzz.getName());
		// ��Ű���� Ŭ���� �̸� ���

		Class clazz = Member.class;
		System.out.println(clazz.getSimpleName());
		// Ŭ���� �̸� ���

	}

}
