package sec02;

public class ThrowsExample {

	public static void main(String[] args) {
		
		try {
			findClass();
		} catch (ClassNotFoundException e) {
			System.out.println("Ŭ������ �������� �ʾƿ�.");
		}finally {
			System.out.println("Ŭ���� ã��");
		}

	}
	public static void findClass() throws ClassNotFoundException{
		Class clazz = Class.forName("java.util.Scanner");
	}
}
