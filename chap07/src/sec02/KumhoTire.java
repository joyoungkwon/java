package sec02;

public class KumhoTire extends Tire{

	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}

	
	
	public boolean roll() {
		++accmulatedRotationg; // 누적 회전수 1증가
		if (accmulatedRotationg < maxRotation) { // 누적회전수가 최대 회전수 보다 작을때
			System.out.println(location + "금호Tire 수명 :" + (maxRotation - accmulatedRotationg) + "회");
			return true; // 최대회전수에서 누적횟수만큼 감소 하고 회 출력(타이어 수명)

		} else { // 누적 회전수가 최대 회전수 보다 클때 타이어 Tire 펑크 출력
			System.out.println("***" + location + "금호Tire 펑크***");
			return false;
		}
	}
}
