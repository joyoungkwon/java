package sec04;

public class Car {
	// Car 클래스 생성
	// 멤버 변수 스피드 설정 기본 스피드 100
	private int speed = 100; // 기본 스피드
	
	
	
	// 메소드 생성
	// 시동걸기 powerOn 시동끄기 powerOff 리턴값 없음 void
	// 속도 증가 speedUp 감소 speedDown   - 10씩 증가 ,10씩 감소  리턴값 int
	// 멈춤 breakZero 0 일때 "시동이 멈췄습니다 출력"
	void powerOn() { // 시동 걸기
		System.out.println("시동이 켜졌습니다.");
	}
	void powerOff() { // 시동 끄기
		System.out.println("시동이 꺼졋습니다.");
	}
	// 속도 증가 메소드
	int speedUp(int x) {  // x 만큼
		speed += x; // 스피드 기본값 100에서 +
		return speed; // 그걸 스피드 매게 변수에
		// 리턴한다.
	}
	// 속도 감소 메소드
	int speedDown(int x) { //x만큼
		speed -= x; // 기본 스피드값에서 x만큼
		return speed; // 빼고 스피드에 리턴한다.
	}
	int breakZero(int x) { // x의 값을 받아도
		speed = 0; // 브레이크 제로란 이름을 만들어
		return speed; // 스피드를 0으로 설정해버린다
		// 그걸 스피드에 0이라고 저장한다.
	}
}
