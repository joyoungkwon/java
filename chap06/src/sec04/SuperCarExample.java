package sec04;

public class SuperCarExample {

	public static void main(String[] args) {
		
		SuperCar myCar = new SuperCar();
		myCar.keyTurnOn(); // void 시동 호출 메소드
		myCar.run();	// for 문 메소드 초기값 10 
		int speed = myCar.getSpeed(); // Sat말고 받을때 get 
		System.out.println("현재속도"+ speed + "km/h");
		// for문 안 출력 구문 5 speed 10세팅 
		
		
		// for 문 안에서 먼저 실행 되고 i값 만큼 반복이 된 메소드안의 있는
		// speed값을 getSpeed로 받아와야 현재속도가 저장 되어
		// 50km/ h 가 출력됨
		
		
	}

}
