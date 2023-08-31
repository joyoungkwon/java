package sec02.exam04;

public class AirconCtrl extends TvRemoctrl{
	String modelName= "에어컨리모컨"; // 모델이름

	
	
	
	@Override
	int chanleUp(int x) {
		int result =+ x;
		System.out.println("어에컨의 온도를 1올립니다.");
		return result;
	}

	@Override
	void On() {
		System.out.println("에어컨의 전원을켭니다.");
	}

	@Override
	void Off() {
		System.out.println("에어컨의 전원을 끕니다.");
	}
	
	
	
}
