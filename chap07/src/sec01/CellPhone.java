package sec01;

public class CellPhone {
	String model;
	String color;
	// 상속받을떄 private 은 물려주지않음
	// private 의 값을 받는 유일한 법은 getter 
	// sat
	
	
	void powerOn() {System.out.println("전원을킵니다.");}
	void powerOff() {System.out.println("전원을끕니다.");}
	void bell() {System.out.println("벨이울립니다.");}
	void sedVoice(String message) {System.out.println("자기."+message);}
	void receiveVoice(String message) {System.out.println("상대방."+message);}
	void hangUp() {System.out.println("전화를 끊습니다");}
	//따로 설정 안했을땐 기본생성자 생성

}
