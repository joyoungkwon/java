package sec01;

public class Computer {
	String comppany;// 제조 회사
	int sell;// 가격
	String production;// 생산년도

	void powerOn() {
		System.out.println("전원을 켭니다."); // 전원을 켭니다
	}

	void powerOff() {
		System.out.println("전원을 끕니다");// 전원을 끕니다
	}

	void web() {
		System.out.println("인터넷에 연결합니다");// 인터넷 연결합니다
	}
	void webx() {
		System.out.println("인터넷 연결에 해제 합니다"); // 인터넷 연결을 해제합니다
	}

	String playGame(String game) {
		String result = game + "란 게임을 합니다";
		return result; // 게임을 합니다
	}
	String offGame(String game) {
		String result = game + "프로그램을 종료 합니다";
		return  result; // 게임을 종료합니다.
	}
}
