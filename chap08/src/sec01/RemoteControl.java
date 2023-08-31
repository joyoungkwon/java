package sec01;

public interface RemoteControl {
	//상수 필드 추상메소드
	//public int s =3; // 인터페이스 필드 올바른 사용 방법이 아님
	// 인터페이스 필드는 상수 필드만 사용 가능 하므로
	// 필드 이름을 대문자로 쓰는것이 관례임
	public int s =3;
	public int MAX_VOLUME=10;
	public int MIN_VOLUME=0;
	
	// 지정해놓고 가져다 쓰는용도 , (선언)
	
	
	
	//public String NAME;
	//상수 필드는 반드시 초기값을 넣어야 함.
	public String NAME = "홍길동";
	
	void tunOn();
	void tunOff();
	public void setVolume(int volume);
	// 인터페이스 메소드는 추상 메소드로 구현함
	
}
