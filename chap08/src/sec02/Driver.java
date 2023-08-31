package sec02;

public class Driver {
	
	public void Driver(Vehicle vehicle) {
		vehicle.run();
//		vehicle.stop(); 
		// Driver 생성자중 Vehicle 을 파라미터로 받는 생성자 생성
		// vehicle.run() 으로 vehicle 메서드 호출
	}
	

	public static void main(String[] args) {
		Driver driver = new Driver();
		// Driver 객체 생성
		Bus bus = new Bus();
		// 버스의 객체 생성
		Taxi taxi = new Taxi();
		// 택시의 객체 생성
		
		
		
		driver.Driver(bus);
		//bus 객체를 매게 변수로 넘겨줌.
		// bus 는 Vehicle 인터페이스의 구현 객체 이므로
		// Vehicle 타입으로 자동변환 되어 들어감
		
//		driver.stop(); Vehicle bus 는 
		// vehicle 타입으로 자동변환 되어 , Override한 run 메서드는 사용 가능 하지만.
		// Override 하지않은 bus안의 stop이라는 메서드는 사용 불가능. - (7)line

	}

}
