package sec05;

public class Car {
	String model;
	int speed;
	
	Car(){ // 기본생성자 
		
	}
		
	Car(String model){
		this.model = model;
	}
	
	void setSpeed(int speed) { // 리턴값 없음
		this.speed = speed;
	}
	void run() { // void 리턴값 없음
		// 10부터 50까지 반복 해서 5번 속도를 대입하고 출력
		for(int i = 10; i <=50; i+=10) {
			this.setSpeed(i);
			System.out.println("현재속도는"+ this.speed);
		}
	}
	public static void main(String[]ags) {
		Car myCar = new Car("포르쉐"); // 인스턴트 메소드
		myCar.run();
		// 공통 ====static 공유
		Car yourCar = new Car();
		yourCar.speed= 60;
		// 정적메소드 은 클래스. 찍고 막바로 사용 가능
		
	}
}
