package sec02;

public class RemoteMain {

	public static void main(String[] args) {
		
		Remote rm = new Remote(); // Remote 객체 생성
		
		rm.rc.turnOn(); // rm 객체 생성 변수명, 그안에 있는 rc 익명 객체로 만든 오버라이드 호출
		rm.method1(); // 익명 개체 필드 사용
		rm.method2(	// 익명 객체 메소드 내부 로컬 변수 사용
				new RemoteControl() {
					
					@Override
					public void turnOn() {
						System.out.println("스마트티비를 켭니다.");
						
					}
					
					@Override
					public void turOff() {
						System.out.println("스마트 티비를 끕니다.");
						
					}
				}
		);
		
	}

}
