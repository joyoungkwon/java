package sec01;

public class MyClass {
	// 필드
	RemoteControl rc = new Television();
	
	// 디폴트 생성자
	// 디폴트 생성자 호출시 Television 구현한 메소드 호출
	MyClass(){
		
	}
	// 인터 페이스를 매개 변수로 하는 생성자. ( 인터페이스를 넣어야 구현 가능 )
	// Television 호출
	// 매개 변수 객체의 메소드 호출.
	MyClass(RemoteControl rc){
		this.rc = rc;
		rc.tunOff(); // Television 구현한 tunOff 호출
		rc.tunOn();// Television 구현한 tunOn호출
		rc.setVolume(5); // Television 구현한 setVolume 호출
	}
	// Audio 객체의 메소드 호출
	void methodA() {
		RemoteControl rc = new Audio();
		rc.tunOn();
		rc.setVolume(5);
		rc.tunOff();
	}
	//매개 변수 객체의 메소드 호출
	void methodB(RemoteControl rc) {
		rc.tunOn();
		rc.setVolume(5);
		
	}
	
}
