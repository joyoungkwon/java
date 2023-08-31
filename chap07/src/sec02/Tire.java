package sec02;

public class Tire {
	// 멤버 필드 선언
	public int maxRotation; // 최대 회전수
	public int accmulatedRotationg; // 누적 회전수
	public String location; // 타이어의 위치
	
	// 생성자
	// 매개 변수 2개 생성자.
	public Tire( String location,int maxRotation) {
		this.maxRotation = maxRotation;
		this.location = location;
	}
	
	// 메소드 매개변수 없음 return 타입 boolean
	public boolean roll() {
		++accmulatedRotationg; // 누적 회전수 1증가
		if (accmulatedRotationg < maxRotation) { // 누적회전수가 최대 회전수 보다 작을때
			System.out.println(location + "Tire 수명 :" + (maxRotation - accmulatedRotationg) + "회");
			return true; // 최대회전수에서 누적횟수만큼 감소 하고 회 출력(타이어 수명)

		} else { // 누적 회전수가 최대 회전수 보다 클때 타이어 Tire 펑크 출력
			System.out.println("***" + location + "Tire 펑크***");
			return false;
		}
	}
	
	
}
