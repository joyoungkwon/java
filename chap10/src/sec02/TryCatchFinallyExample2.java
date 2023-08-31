package sec02;

public class TryCatchFinallyExample2 {

	public static void main(String[] args) {

		String data = null;
		String data2 = null;

		try {
			data = args[0];
			data2 = args[1];

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("���� �ε��� ���� �ڸ����� �����մϴ�.");
			return; // - ����. 
		}
		
		try {
			int value1 = Integer.parseInt(data);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println("�μ��� ����:\t"+result);
			
		} catch (NumberFormatException e) {
			System.out.println("��ȯ�Ҽ� �����ϴ�.");
		} finally {
			System.out.println("�ٽ� �����ϼ���");
		}

	}

}
