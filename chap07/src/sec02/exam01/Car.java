package sec02.exam01;

public class Car {
	// 멤버변수
	String color ; // 색깔
	String company;//제조회사
	int speed ; // 자동차 속도
	int cost ; // 가격
	
	
	//생성자, 안만들면 default(기본) 생성자, 만들면 기본 생성자 x
	
	public Car(String color, String company) {
		this.color = color;
		this.company = company;
	}
	// 매개 변수 1개 메소드 리턴타입 x (void)
	// 필드값에 있는 speed를 매개변수 speed 값만큼 증가시킨다
	void speedUp(int speed) {
		this.speed += speed; // this= 멤버변수 가 speed 인걸 표시 
		System.out.println(speed);
	}
	//  매개 변수 1개 메소드 리턴타입 (void) 없음
	//  필드값에 있는 speed 를 매개변수 speed 만큼 감소 시킨다.
	void speedDown(int speed) {
		this.speed -= speed;
	}
	// 매개변수 없고 return값이 없는 void 메소드 
	// 실행시 시동을 걸었습니다 출력
	//-오버라이드 할것
	void start() {
		System.out.println("시동을 걸었습니다.");
	}
	// 매개변수 없고 return값이 없는 void 메소드 
	// 실행시 시동을 멈췄습니다 출력
	//-오버라이드 할것
	void stop() {
		System.out.println("시동을 멈췄습니다.");
	}
	
}
