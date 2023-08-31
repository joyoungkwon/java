package sec02;

public class CarMain {

	public static void main(String[] args) {
		
		Car2 car2 = new Car2();
		
		car2.car.Stop();
		// 오버라이드 된 stop 메소드 호출 가능.
		// 오버 라이드  된 메소드안에, speedup();메소드까지 호출.
		
		car2.speedDown();
	}

}
