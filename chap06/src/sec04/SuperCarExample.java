package sec04;

public class SuperCarExample {

	public static void main(String[] args) {
		
		SuperCar myCar = new SuperCar();
		myCar.keyTurnOn(); // void �õ� ȣ�� �޼ҵ�
		myCar.run();	// for �� �޼ҵ� �ʱⰪ 10 
		int speed = myCar.getSpeed(); // Sat���� ������ get 
		System.out.println("����ӵ�"+ speed + "km/h");
		// for�� �� ��� ���� 5 speed 10���� 
		
		
		// for �� �ȿ��� ���� ���� �ǰ� i�� ��ŭ �ݺ��� �� �޼ҵ���� �ִ�
		// speed���� getSpeed�� �޾ƿ;� ����ӵ��� ���� �Ǿ�
		// 50km/ h �� ��µ�
		
		
	}

}
