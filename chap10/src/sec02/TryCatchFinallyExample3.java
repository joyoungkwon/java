package sec02;

public class TryCatchFinallyExample3 {

	public static void main(String[] args) {

		try {
			//String data1 = args[0];
			//String data2 = args[1];
			
			String data1 = "가나";
			String data2 = "다라";
			
			// String data1 = "123";
			 //String data2 = "456";
			
			data1 = args[0];
			data2 = args[1];
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println("두수의 합은:\t"+result);
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("매게값 부족");
		}catch(NumberFormatException e) {
			System.out.println("숫자변환불가.");
		}finally {
			System.out.println("다시실행필요");
		}
		

}
}