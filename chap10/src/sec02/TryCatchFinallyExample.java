package sec02;

public class TryCatchFinallyExample {

	public static void main(String[] args) {
		
		try {
			Class clazz = Class.forName("java.lang.String2"); //  forName = 찾아라. 찾아서 대입해라.
		} catch (ClassNotFoundException e) {
			System.out.println("클래스가 존재하지않습니다."); // 존재 하지않으면 catch
		}finally {
			System.out.println("처리.");// 무조건실행.참이든 거짓이든.
		}
	}

}
