package sec04;

public class ���⿹��1 {

	public static void main(String[] args) {
		���� myCalc = new ����();  // ���� ������ ȣ�� ��ü ����
		myCalc.powerOn();
		
		int result1= myCalc.plus(5, 3); // ���ϰ��� �ִ� �޼ҵ� ȣ��
		System.out.println(result1); // int �� �����Ͽ�  int �� �ް� �����ؾ���
		
		int result2 = myCalc.minus(5, 3); // ���� �ִ� �� return
		System.out.println(result2); 
		
		String result3 = myCalc.mul(3, 0);
		System.out.println(result3);
		
		double result4 = myCalc.divide(5, 2);
		System.out.println(result4);
		
		byte x = 10; 		// ����Ʈ
		byte y = 4;
		double result5 = myCalc.divide(x, y);
		System.out.println(result5);
	}

}
