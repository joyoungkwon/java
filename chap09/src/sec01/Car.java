package sec01;

public class Car {
	String company;//제조회사
	int speed; // 속도
	int cost;  // 가격
	static String color;//색상
	
	// default 생성자.
	Car(){
		System.out.println("Car 호출");
	}
	
	// 리턴값이 없는 void 메서드
	void speedUp(int speed) {
		this.speed += speed;
		System.out.println(speed);
	}
	
	void stop() {
		System.out.println("Car 멈춤");
	}
	
	static void stop2() {
		System.out.println("Car 멈춤");
	}

	
	
	// Car 클래스 안에서 OldCar 클래스 선언.
	class OldCar{ //중첩 클래스 (인스턴스 멤버 클래스)
		int speed;
		int cost;
		
		
		OldCar(){
			System.out.println("OldCar 호출");
		}
		
		
		void speedUp(int speed) {
			this.speed += speed;
		}
		
		void carCall() {
			// 인스턴스 메소드에서
			// 바깥 클래스의 필드와 메소드 접근 가능함.
			company ="현대";
			stop();
		}
		
	}
	
	// Car클래스 안에서 Truck 메소드 만들기 필드값 speed cost , 생성자 - default 생성자. 출력 구문 메소드 speedUp
	static class Truck{
		int speed;
		int cost;
		
		Truck(){
			System.out.println("Truck 호출");
		}
		
		void speedUp(int speed) {
			this.speed += speed;
		}
		void speedDown(int speed) {
			this.speed -= speed;
		}
		
		void carCall() {
			// 인스턴스 메소드에서
			// 바깥 클래스의 필드와 메소드 접근 가능함.
			//company ="현대";
			//stop();
			color="빨강";
			stop2();
		}
		
	}
}
