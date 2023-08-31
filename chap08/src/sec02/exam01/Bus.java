package sec02.exam01;

public class Bus implements Vehicle {

	
	// Vehicle 의 인터페이스  추상메소드 구현.(implements)
	@Override
	public void run() {
		System.out.println("버스가 달립니다.");
		
	}
	//bus의 Override 하지않은 메서드.
	public void stop() {
		System.out.println("버스가 멈춥니다.");
	}
	

}
