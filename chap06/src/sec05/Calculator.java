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
		
		// static �޼ҵ� �� �ν���Ʈ �ʵ� �޼ҵ� ��� ���� (���̸���)
		// static �޼ҵ忡 this ��� �Ұ�
	}
}
