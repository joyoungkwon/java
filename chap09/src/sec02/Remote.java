package sec02;

public class Remote  {
	RemoteControl rc = new RemoteControl() { // 괄호 안의 ; 붙히지않고 중괄호 끝나는 부분에 ; 으로 구역 나누기.
		//RemoteControl 를 rc로 객체 생성후 익명객체로 오버라이드
		
		
		public void berakTV() {
			System.out.println("그러다 맘에 안들어서 끌래요 짜증나 진짜로.");
		}// 개인 메소드를 오버라이드 메소드 안에 호출 하면
		
		
		
		@Override
		public void turnOn() {
			System.out.println("티비를 켭니다."); // interface 의 추상 메소드 turnOn를 구현하는 메소드
			berakTV(); // 개인 메소드 호출
			
		}
		
		@Override
		public void turOff() {
			System.out.println("티비를 끕니다."); // interface 의 추상메소드 turnOff를 구현하는 메소드
			
		}
	};
		// 메소드 내부 로컬 변수로 익명 구현 객체 사용
	void method1() {
		RemoteControl locVar = new RemoteControl() {

			@Override
			public void turnOn() {
				System.out.println("오디오를 켭니다");
				
			}

			@Override
			public void turOff() {
				System.out.println("오디오를 켭니다");
				
			}
			
		};
		// 익명 구현 객체 내부 메소드는
		// 외부 메소드에서 반드시 호출이 필요함.
		locVar.turnOn();
		locVar.turOff(); // 안쪽 메소드 구현 시킨걸 익명객체 안 말고 메소드 1이라는 큰 틀에서 호출을 해줘야 
		// 결과값이 나옴.
	}
	// 파라미터로 익명구현객체를 사용하는 메소드
	void method2(RemoteControl rc) {
		rc.turnOn();
		rc.turOff();
	}

}
