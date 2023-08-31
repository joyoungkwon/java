package sec02;

public class ThrowsExample {

	public static void main(String[] args) {
		
		try {
			findClass();
		} catch (ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않아요.");
		}finally {
			System.out.println("클래스 찾음");
		}

	}
	public static void findClass() throws ClassNotFoundException{
		Class clazz = Class.forName("java.util.Scanner");
	}
}
