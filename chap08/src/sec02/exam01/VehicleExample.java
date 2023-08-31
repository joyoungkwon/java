package sec02.exam01;

public class VehicleExample {

	public static void main(String[] args) {
		
		Vehicle vehicle = new Bus();// 인터페이스 구현객체 bus 
		
		vehicle.run();  // 오버라이드 된 버스 메서드 호출
//		vehicle.stop(); 은 호출 안됌 버스의 Override 하지않음 
		
		Bus bus = (Bus) vehicle; // 인터페이스 vehicle을 구현한 bus로 , vehicle을 강제변환 
		bus.stop(); // 강제변환 한후 호출 가능.
	}
	//Vehicle vehicle = new Vehicle();
	// 인터페이스는 생성자 , 객체를 자기 스스로 가질수 없음.
	// 인터페이스는 다중상속이 가능함.

}
