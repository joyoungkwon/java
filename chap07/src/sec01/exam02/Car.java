package sec01.exam02;

public class Car {
	String model; // 모델
	String company; // 제조회사
	int cost ; // 가격
	int fuel; // 연비
	public Car(String model, String company) { // 매개 변수 2개 사용하는 생성자 (임의) 안만들시 default 생성자 만들어짐
		this.model = model;
		this.company = company;
	}
	void powerOn() {System.out.println("시동을 켭니다");}
	void powerOff() {System.out.println("시동을 끕니다");}
	
	void speedUp(int speed) {
		System.out.println(speed+"만큼 증가합니다");
	}
	void speedDown(int speed) {
		System.out.println(speed+"만큼 감소합니다");
	}

}
