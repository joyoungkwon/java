package sec02.exam05;

public class Phone {
	
	// 필드값 핸드폰의 특성
	String company ; // 제조회사
	int cost =100000; // 가격
	String color ; // 휴대폰 색상.
	
 // 생성자 기본 생성자 default
	
	// 리턴 x 메소드
	void ring() {
		System.out.println("전화가 울립니다 링링");
	}
	//리턴 x 메소드
	void powerOn() {
		System.out.println("전원을 켭니다");
	}
	//리턴 x 메소드
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
}
