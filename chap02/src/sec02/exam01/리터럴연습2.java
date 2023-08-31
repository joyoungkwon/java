package sec02.exam01;

public class 리터럴연습2 {

	public static void main(String[] args) {
		byte var1 = 115;
		byte var2 = 0;
		// byte var3 = 128; byte 수 표현 범위를 벗어남
		byte var3 = 127;  //-범위수
		System.out.println(var1);
		System.out.println(var2);	
		System.out.println(var3);
		
		// bit < byte < short < int < long
		long var4= 12345678;
		//long var5= 1000000000000; int 가 인식하는 범위를 벗어남
		long var5= 1000000000000L;
		long var6= 1000000000000L;
		System.out.println(var4);
		System.out.println(var5);
		System.out.println(var6);
	}

}
