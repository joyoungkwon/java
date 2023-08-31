package sec02;

public class Taxi implements Vehicle {

	
	// Vehicle 의 인터페이스  추상메소드 구현.(implements)
	@Override
	public void run() {
		System.out.println("택시가 달립니다.");
		
	}

}
