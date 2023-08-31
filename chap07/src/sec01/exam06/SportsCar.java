package sec01.exam06;

public class SportsCar extends Car { // Car 상속

	@Override // 오버라이딩
	public void speedUp() {
		speed += 10; // 기존에 있던 메소드의 speed +=1 을 10으로 오버라이딩
	}
//	@Override
//	public void stop() { //final 메소드는 메소드 오버라이딩이 안됨
//		System.out.println("차를 멈춤"); //- Cannot override the final method 
//		speed = 0;
//	}

	public void stop(int x) {
		System.out.println("스포츠카 를 멈춤");
		speed = 0;
		// 메소드 이름이 같아도 넘겨주는 값이나 매개변수가 다르면 다른 메소드로 인식
	}
}
