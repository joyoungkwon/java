package sec02;

public class Car {
	Tire frontLeftTire = new HangokTire();
	Tire frontRightTire = new HangokTire();
	Tire backLeftTire = new HangokTire();
	Tire backRightTire = new HangokTire();
	//Tire �������̽��� �ڵ���ȯ �Ǿ�����
	// �ڽ� Ŭ������ OverRide roll �޼ҵ�� ������ ��.
	// �������̽� Ÿ���� �ʵ� . 
	
	
	void run() {
		frontLeftTire.roll();
		frontRightTire.roll();
		backLeftTire.roll();
		backRightTire.roll();
	}
	public static void main(String[]args) {
		Car myCar = new Car();
		myCar.run();
		
		myCar.frontLeftTire =new KumhoTire(); // frontLeftTire ��ü�� KumhoTire�� �ѱ�
		myCar.run(); // run �޼ҵ��� frontLeftTire �� kumhoTire�� �ٲ�
//		��ȣ Ÿ�̾ �������ϴ�.
//		�ѱ� Ÿ�̾ �������ϴ�.
//		�ѱ� Ÿ�̾ �������ϴ�.
//		�ѱ� Ÿ�̾ �������ϴ�.
		
	}
}
