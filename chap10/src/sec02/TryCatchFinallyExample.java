package sec02;

public class TryCatchFinallyExample {

	public static void main(String[] args) {
		
		try {
			Class clazz = Class.forName("java.lang.String2"); //  forName = ã�ƶ�. ã�Ƽ� �����ض�.
		} catch (ClassNotFoundException e) {
			System.out.println("Ŭ������ ���������ʽ��ϴ�."); // ���� ���������� catch
		}finally {
			System.out.println("ó��.");// �����ǽ���.���̵� �����̵�.
		}
	}

}
