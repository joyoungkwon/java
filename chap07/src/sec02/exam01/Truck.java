package sec02.exam01;

public class Truck extends Car{
	int weight ; // 적재용량
	String trunkSize; // 트렁크 사이즈 // 대 중 소
	int maxspeed ; // 트럭이 달릴수 있는 최대 속도 
	
	// 상속 받은 클래스 안의 생성자 호출 해야
	// 빨간줄 안됌
	// 매개변수 4개 (부모 2개, 자식 2개)
	public Truck(String color, String company, int weight, String trunkSize) {
		super(color, company);
		this.weight = weight;
		this.trunkSize = trunkSize;
	}
	// 리턴 값 없는 void 타입 메소드
	// 매개변수 1개.
	// 멤버변수 maxSpeed 를 입력한 매개변수 maxSpeed 만큼 +해서 대입
	
	void maxSpeed(int maxSpeed) {
		this.maxspeed += maxspeed;
	}
	// car 메소드 start stop 오버라이드
	@Override
	void start() {
		//super.start(); // (Car의 메소드를 호출 )
		// super.start(); 와 같이 출력하면 Car 메소드의
		// 입력값이 같이나옴.
		System.out.println("트럭이 출발 했습니다.");
	}

	@Override
	void stop() {
		System.out.println("트럭이 멈췄습니다.");
	}
	
	
	
	
}
