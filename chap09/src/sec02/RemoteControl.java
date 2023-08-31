package sec02;

public interface RemoteControl {
	
	// interface 는 메소드는 추상메소드를 갖을수 있고
	// 필드변수 에서는 상수 값만 갖을수 있다
	// 이에 상수는 변하지 않는 다는 뜻으로 (final)
	// 상수 필드를 선언할때는 반드시초기값세팅 과 관례로 대문자로 표기한다.
	String COMPANY="삼성";
	int COST = 5000;
	
	
	
	
	
	
	public void turnOn(); // 추상 메소드
	public void turOff();
	

}
