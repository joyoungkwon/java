package sec04;

public class GasCarExample {

	public static void main(String[] args) {
		GasCar myCar = new GasCar(); //��ü���� �ҷ�����
		
		myCar.setGas(5); // �޼ҵ� ȣ��
		
		
		boolean gasState = myCar.isLeftGas(); // Car�� isLeftGas ȣ��
		// isLeftrGas = gas�� 0�϶� �����ϴ� flase 0���� Ŭ�� true
		// ��ó�� ���� �� 5 gasState = true 
		
		
		if (gasState) { // true 1
			System.out.println("����մϴ�"); // true 2 ���� 
			myCar.run(); // Car �� run ȣ�� 
			// run = gas �� 0�� �ɶ����� -1
			// run else 0 �̸� ���� return 
		}
		if(myCar.isLeftGas()) { // isLeftGas �޼ҵ� 
		// ������ run �޼ҵ带 ������ ���� �ҷ��ͼ�
		// 0 �� �Ǿ� ���� ������ �ݺ� �ϴٰ� ��������
		// ������ �����ض� �� ���
			System.out.println("������ ������ �ʿ䰡 �����ϴ�.");
		}else {
			System.out.println("������ �����ϼ���");
		}
		// �׷��� 0�� ���� �ʰ� ���� �����ʿ䰡 ���ٰ� �ҷ���
		// 
	}

}
