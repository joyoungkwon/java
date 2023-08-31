package sec03.exam07;

public class 확인문제 {

	public static void main(String[] args) {
		int intValue = 10;
		char charValue = 'A';
		double doubleValue = 5.7;
		String strValue = "A";
		double var = (double) intValue;
		byte var2 = (byte) intValue;
		int var3 = (int) doubleValue;

		char var4 = strValue.charAt(0);

		byte byteValue = 10;
		float floatValue = 2.5f;
		double doubleValue2 = 2.5;

		int result = byteValue + byteValue; // byte타입 끼리 더하면 int //

		char c1 = 'a';
		int c2 = c1 + 1;
		System.out.println((char) c2);

		int x = 5;
		int y = 2;
		int result3 = x / y;
		System.out.println(result3);

		double result4 = (double) x / y;
		System.out.println(result4);

		double var5 = 3.5;
		double var6 = 2.7;

		int result5 = (int)(var5+var6);
		 
		 
		 
	}

}
