package sec02;

public class Car {
	Tire frontLeftTire = new HangokTire();
	Tire frontRightTire = new HangokTire();
	Tire backLeftTire = new HangokTire();
	Tire backRightTire = new HangokTire();
	//Tire 인터페이스로 자동변환 되었으나
	// 자식 클래스의 OverRide roll 메소드는 가지고 감.
	// 인터페이스 타입의 필드 . 
	
	
	void run() {
		frontLeftTire.roll();
		frontRightTire.roll();
		backLeftTire.roll();
		backRightTire.roll();
	}
	public static void main(String[]args) {
		Car myCar = new Car();
		myCar.run();
		
		myCar.frontLeftTire =new KumhoTire(); // frontLeftTire 객체의 KumhoTire를 넘김
		myCar.run(); // run 메소드의 frontLeftTire 가 kumhoTire로 바뀜
//		금호 타이어가 굴러갑니다.
//		한국 타이어가 굴러갑니다.
//		한국 타이어가 굴러갑니다.
//		한국 타이어가 굴러갑니다.
		
	}
}
