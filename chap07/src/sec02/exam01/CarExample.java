package sec02.exam01;

public class CarExample {

	public static void main(String[] args) {
		
		Truck turck = new Truck("블랙","벤츠",3,"중"); // 트럭 생성자 매개변수4개
		
		Car car = turck; // 자동 타입변환
		// turck 을 car 클래스에 넣음 
		
		
		car.speedUp(30); // 부모 메소드 호출
		//car.maxSpeed(50) 
		// 타입이 변환 되었기 때문에 자식 메소드 호출 불가능
		car.start();
		// 자식의 메소드 이지만 오버라이딩 했기 때문에 호출 가능
		car.stop();
		
	}

}
