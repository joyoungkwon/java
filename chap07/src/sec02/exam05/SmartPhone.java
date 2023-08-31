package sec02.exam05;

public class SmartPhone extends Phone{
	// Phone 클래스의 생성자가 default 생성자 기 때문에 오류 없음
	
	boolean touch; // boolean 타입의 터치
	String camera; // 카메라
	String phoneCase; // 폰케이스
	String protectedFilm;// 필름
	int cost = 200000;
	
	
	
	// extends 상속 받은 부모의 메소드를 재정의
	// 리턴 x 
	@Override
	void ring() {
		System.out.println("스마트폰이 울립니다 링링");
	}
	// 리턴 x
	void videoOn() {
		System.out.println("동영상을 재생 합니다.");
		// 리턴 x
	}
	void videoOff() {
		System.out.println("동영상 재생을 멈춥니다.");
	}
	
	
	
}
