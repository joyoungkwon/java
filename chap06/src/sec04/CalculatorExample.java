package sec04;

public class CalculatorExample {

	public static void main(String[] args) {
		Calculator myCalc = new Calculator();
		myCalc.println("������"); // ���� �� ���� ����ȣ�� ����

		int result1 = myCalc.plus(6, 4); // ���ϰ��� �������� ���� Ÿ���� ���ο� ��ü ����
		// ���ϰ� ���� ����ȣ�� ����
		System.out.println(result1);

		double result2 = myCalc.avg(10, 15);
		System.out.println(result2);
		// ���ϰ� ���� ����ȣ�� ���� int result1 �� �޼ҵ� �հ� ����ȣ�� �� �۾�

		myCalc.execute(); // ���ϰ� x ����ȣ�� 3��
		
		
	}

}
