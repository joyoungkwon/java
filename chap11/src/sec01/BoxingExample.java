package sec01;

public class BoxingExample {

	public static void main(String[] args) {
		// Wrapper Ŭ���� Boxing(����)
		Integer obj1 = new Integer(100);
		Integer obj2 = new Integer("200");
		Integer obj3 = new Integer("300");
		
		// Wrapper Ŭ���� Boxing(��������)
		int value1 = obj1.intValue();
		int value2 = obj2.intValue();
		int value3 = obj3.intValue();
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		
		Integer obj4 = new Integer(100);
		Integer obj5 = new Integer(100);
		
		int num1 = 100;
		int num2 = 100;
		
		System.out.println(obj4==obj5); // ��ü ��
		System.out.println(num1==num2); // int ����
		
	}

}
