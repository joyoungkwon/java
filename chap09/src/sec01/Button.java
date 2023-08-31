package sec01;

public class Button {
	OnClickListener listener;
	
	void setOnClickListener(OnClickListener listener) { // 인터페이스 타입 객체 파라미터.
		this.listener = listener;
	}
	void touch() {
		listener.onclick();
	}
	static interface OnClickListener{ //추상 메소드 , 상수필드 만 저장 가능 interface 
		// 클래스 안에 꼭 필요한 기능을 넣어야 할때. 구현해야 할떄. 중첩 interface 사용
		void onclick();
	}
}
