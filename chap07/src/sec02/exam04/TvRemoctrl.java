package sec02.exam04;

public class TvRemoctrl extends Remoctrl {
	String modelName = "Tv리모컨"; // 리모컨의 모델 이름

	int chanleUp(int x) { // 채널 올리는 메소드
		int result = +x;
		System.out.println("Tv의 전원을 " + result + "만큼 위로 올립니다.");
		return result;
	}

	// extends 부모 클래스 메소드 호출 후 재정의 Override
	@Override
	void On() {
		System.out.println("Tv의 전원을 켭니다.");

	}
	// extends 부모 클래스 메소드 호출후 재정의 Override
	@Override
	void Off() {
		System.out.println("Tv의 전원을 끕니다.");
	}

}
