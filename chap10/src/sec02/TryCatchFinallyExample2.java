package sec02;

public class TryCatchFinallyExample2 {

	public static void main(String[] args) {

		String data = null;
		String data2 = null;

		try {
			data = args[0];
			data2 = args[1];

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 인덱스 값의 자리수가 부족합니다.");
			return; // - 멈춤. 
		}
		
		try {
			int value1 = Integer.parseInt(data);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println("두수의 합은:\t"+result);
			
		} catch (NumberFormatException e) {
			System.out.println("반환할수 없습니다.");
		} finally {
			System.out.println("다시 실행하세요");
		}

	}

}
