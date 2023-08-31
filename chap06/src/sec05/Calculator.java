package sec05;

public class Calculator {
	static double pi =3.14159;
	
	static int Plus(int x , int y) {
		return x+y;
	}
	static int Minus(int x , int y) {
		return x-y;
	}
	public static void main(String[]agrs) {
		double result1 = 10 * 10 * Calculator.pi; 
		System.out.println(result1);
		
		// static 메소드 에 인스턴트 필드 메소드 사용 금지 (같이못씀)
		// static 메소드에 this 사용 불가
	}
}
